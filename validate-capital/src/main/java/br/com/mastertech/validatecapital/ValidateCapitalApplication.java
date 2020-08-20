package br.com.mastertech.validatecapital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RibbonClients
@EnableFeignClients
public class ValidateCapitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(ValidateCapitalApplication.class, args);
	}
}
