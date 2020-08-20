package br.com.mastertech.company.controller;

import br.com.mastertech.company.dto.CompanyRequest;
import br.com.mastertech.company.entity.Company;
import br.com.mastertech.company.mapper.CompanyMapper;
import br.com.mastertech.company.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cadastro")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/empresa")
    public ResponseEntity post(@RequestBody CompanyRequest companyRequest) {
        Company company = CompanyMapper.INSTANCE.companyRequestToCompany(companyRequest);
        Company savedCompany = registrationService.save(company);
        return ResponseEntity.created(URI.create("")).body(CompanyMapper.INSTANCE.companyToCompanyRequest(savedCompany));
    }
}
