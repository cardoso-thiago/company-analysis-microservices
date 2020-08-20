package br.com.mastertech.validatecapital.consumer;

import br.com.mastertech.company.dto.CompanyRequest;
import br.com.mastertech.validatecapital.client.Company;
import br.com.mastertech.validatecapital.client.CompanyCapitalClient;
import br.com.mastertech.validatecapital.producer.CompanyReportProducer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CompanyInfoConsumer {

    private final CompanyCapitalClient companyCapitalClient;
    private final CompanyReportProducer companyReportProducer;

    public CompanyInfoConsumer(CompanyCapitalClient companyCapitalClient, CompanyReportProducer companyReportProducer) {
        this.companyCapitalClient = companyCapitalClient;
        this.companyReportProducer = companyReportProducer;
    }

    @KafkaListener(topics = "spec4-thiago-cardoso-2", groupId = "companyInfo")
    public void receiveAccessInfo(@Payload CompanyRequest companyInfo) {
        Company companyData = companyCapitalClient.getCompanyData(companyInfo.getCnpj().replaceAll("[^\\d]", ""));
        companyReportProducer.sendCompanyInfo(companyData);
    }
}
