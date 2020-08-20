package br.com.mastertech.validatecapital.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "companyValidation", url = "https://www.receitaws.com.br")
public interface CompanyCapitalClient {
    @GetMapping("/v1/cnpj/{cnpj}")
    Company getCompanyData(@PathVariable String cnpj);
}
