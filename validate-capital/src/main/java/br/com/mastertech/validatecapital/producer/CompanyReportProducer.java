package br.com.mastertech.validatecapital.producer;

import br.com.mastertech.validatecapital.client.Company;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CompanyReportProducer {
    private final KafkaTemplate<String, Company> companyProducer;

    public CompanyReportProducer(KafkaTemplate<String, Company> companyProducer) {
        this.companyProducer = companyProducer;
    }


    public void sendCompanyInfo(Company company){
        companyProducer.send("spec4-thiago-cardoso-3", company);
    }
}
