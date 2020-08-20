package br.com.mastertech.company.service;

import br.com.mastertech.company.entity.Company;
import br.com.mastertech.company.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final CompanyRepository companyRepository;

    public RegistrationService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company save(Company company) {
        Company savedCompany = companyRepository.save(company);
        //TODO enviar dados via KAFKA
        return savedCompany;
    }
}
