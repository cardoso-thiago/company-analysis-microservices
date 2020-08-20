package br.com.mastertech.company.mapper;

import br.com.mastertech.company.dto.CompanyRequest;
import br.com.mastertech.company.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    Company companyRequestToCompany(CompanyRequest companyRequest);

    CompanyRequest companyToCompanyRequest(Company companyRequest);
}
