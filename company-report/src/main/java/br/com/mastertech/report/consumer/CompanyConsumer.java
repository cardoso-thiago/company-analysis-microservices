package br.com.mastertech.report.consumer;

import br.com.mastertech.validatecapital.client.Company;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class CompanyConsumer {
    @KafkaListener(topics = "spec4-thiago-cardoso-3", groupId = "companyReport")
    public void receiveAccessInfo(@Payload Company company) throws IOException {
        writeToCsvFile(company);
    }

    private void writeToCsvFile(Company company) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        String dateReport = LocalDate.now().format(formatter);
        File csvFile = new File("report/company_capital_" + dateReport + ".csv");
        FileWriter out = new FileWriter(csvFile, true);
        if (csvFile.length() > 0) {
            try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT)) {
                addRecord(company, printer);
            }
        } else {
            String[] headers = {"company_name", "fancy_name", "company_size", "cnpj", "capital", "accepted"};
            try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader(headers))) {
                addRecord(company, printer);
            }
        }
    }

    private void addRecord(Company company, CSVPrinter printer) throws IOException {
        BigDecimal capitalSocial = company.getCapitalSocial();
        boolean accepted = capitalSocial.compareTo(new BigDecimal("1000000")) > 0;
        printer.printRecord(company.getNome(), company.getFantasia(), company.getPorte(), company.getCnpj(), capitalSocial, accepted);
    }
}
