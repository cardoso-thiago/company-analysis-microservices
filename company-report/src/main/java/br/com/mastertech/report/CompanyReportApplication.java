package br.com.mastertech.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients
public class CompanyReportApplication {
	public static void main(String[] args) {
		SpringApplication.run(CompanyReportApplication.class, args);
	}
}
