package br.com.mastertech.company.dto.builder;

import br.com.mastertech.company.dto.CompanyRequest;

public final class CompanyRequestBuilder {
    private String cnpj;

    private CompanyRequestBuilder() {
    }

    public static CompanyRequestBuilder aCompanyRequest() {
        return new CompanyRequestBuilder();
    }

    public CompanyRequestBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public CompanyRequest build() {
        return new CompanyRequest(cnpj);
    }
}
