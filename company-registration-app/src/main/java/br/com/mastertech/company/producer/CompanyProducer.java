package br.com.mastertech.company.producer;

import br.com.mastertech.company.dto.CompanyRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CompanyProducer {
    private final KafkaTemplate<String, CompanyRequest> companyProducer;

    public CompanyProducer(KafkaTemplate<String, CompanyRequest> companyProducer) {
        this.companyProducer = companyProducer;
    }

    public void sendCompanyInfo(CompanyRequest companyRequest){
        companyProducer.send("spec4-thiago-cardoso-2", companyRequest);
    }
}
