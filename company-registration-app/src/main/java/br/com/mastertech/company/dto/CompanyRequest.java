package br.com.mastertech.company.dto;

import br.com.mastertech.company.dto.builder.CompanyRequestBuilder;

public class CompanyRequest {
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
