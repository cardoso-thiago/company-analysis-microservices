package br.com.mastertech.validatecapital.client;

import br.com.mastertech.validatecapital.exception.ServiceDownException;

public class CompanyFallback implements CompanyCapitalClient {

    @Override
    public Company getCompanyData(String cnpj) {
        throw new ServiceDownException();
    }
}