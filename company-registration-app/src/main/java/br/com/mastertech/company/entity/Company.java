package br.com.mastertech.company.entity;


import br.com.mastertech.company.entity.builder.CompanyBuilder;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cnpj;

    public Company() {
    }

    public Company(String cnpj) {
        this.cnpj = cnpj;
    }

    public static CompanyBuilder builder() {
        return CompanyBuilder.aCompany();
    }

    public Long getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }
}
