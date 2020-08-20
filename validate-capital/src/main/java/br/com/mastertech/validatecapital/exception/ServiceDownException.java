package br.com.mastertech.validatecapital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta das empresas está temporariamente indisponível.")
public class ServiceDownException extends RuntimeException {}
