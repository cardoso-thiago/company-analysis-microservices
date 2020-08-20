package br.com.mastertech.company.service;

import br.com.mastertech.company.entity.Company;
import br.com.mastertech.company.exception.CompanyAlreadyExists;
import br.com.mastertech.company.mapper.CompanyMapper;
import br.com.mastertech.company.producer.CompanyProducer;
import br.com.mastertech.company.repository.CompanyRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final CompanyRepository companyRepository;
    private final CompanyProducer companyProducer;

    public RegistrationService(CompanyRepository companyRepository, CompanyProducer companyProducer) {
        this.companyRepository = companyRepository;
        this.companyProducer = companyProducer;
    }

    public Company save(Company company) {
        Company savedCompany;
        try {
            savedCompany = companyRepository.save(company);
        } catch (DataIntegrityViolationException e) {
            throw new CompanyAlreadyExists();
        }
        companyProducer.sendCompanyInfo(CompanyMapper.INSTANCE.companyToCompanyRequest(savedCompany));
        return savedCompany;
    }
}
