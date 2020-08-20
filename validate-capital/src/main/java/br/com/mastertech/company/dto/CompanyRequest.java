package br.com.mastertech.company.dto;

public class CompanyRequest {
    private String cnpj;

    public CompanyRequest() {
    }

    public CompanyRequest(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
