package br.com.mastertech.company.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "A empresa já está cadastrada.")
public class CompanyAlreadyExists extends RuntimeException{}
