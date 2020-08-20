package br.com.mastertech.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients
public class CompanyRegistrationAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyRegistrationAppApplication.class, args);
    }
}
