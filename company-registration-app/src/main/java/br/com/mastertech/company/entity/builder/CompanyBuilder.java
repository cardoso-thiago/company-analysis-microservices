package br.com.mastertech.company.entity.builder;

import br.com.mastertech.company.entity.Company;

public final class CompanyBuilder {
    private String cnpj;

    private CompanyBuilder() {
    }

    public static CompanyBuilder aCompany() {
        return new CompanyBuilder();
    }

    public CompanyBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public Company build() {
        return new Company(cnpj);
    }
}
