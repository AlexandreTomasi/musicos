package com.empresaalexandre.soap.webservice.customersadministration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.empresaalexandre.soap.webservice.customersadministration.repository.CustomerRepository;

@SpringBootApplication
@EntityScan(basePackages = {"com.empresaalexandre.soap.webservice.customersadministration.model"})
@EnableJpaRepositories(basePackages = {"com.empresaalexandre.soap.webservice.customersadministration.repository"})
public class CustomersAdministrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersAdministrationApplication.class, args);
		//http://localhost:8080/ws/musicos.wsdl
		
	}
}