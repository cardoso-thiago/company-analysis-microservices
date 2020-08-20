package br.com.mastertech.company.dto;

import br.com.mastertech.company.dto.builder.CompanyRequestBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CompanyRequest {
    @NotNull(message = "O cnpj da empresa não pode ser nulo.")
    @NotEmpty(message = "O cnpj da empresa não pode ser vazio.")
    @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$", message = "O CNPJ deve estar no formato 00.000.000/0001-00.")
    private String cnpj;

    public CompanyRequest() {
    }

    public CompanyRequest(String cnpj) {
        this.cnpj = cnpj;
    }

    public static CompanyRequestBuilder builder() {
        return CompanyRequestBuilder.aCompanyRequest();
    }

    public String getCnpj() {
        return cnpj;
    }
}
