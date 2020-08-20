package br.com.mastertech.validatecapital.exception;

import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {FeignException.FeignClientException.class, FeignException.FeignServerException.class})
    protected ResponseEntity<Object> handleFeignException(FeignException e) {
        return ResponseEntity.status(e.status()).body(getFeignError(e));
    }

    private String getFeignError(FeignException e) {
        String error = e.getLocalizedMessage();
        Optional<ByteBuffer> body = e.responseBody();
        if (body.isPresent()) {
            error = StandardCharsets.UTF_8.decode(body.get()).toString();
        }
        return error;
    }
}