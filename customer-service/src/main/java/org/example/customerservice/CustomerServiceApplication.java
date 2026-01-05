package org.example.customerservice;

import org.example.customerservice.config.CustomerConfigParams;
import org.example.customerservice.entities.Customer;
import org.example.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
@RefreshScope
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder()
					.name("Hamza")
					.email("hamza@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("oussama")
					.email("oussama@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("ghita")
					.email("ghita@gmail.com")
					.build());

			customerRepository.findAll().forEach(customer -> {
				System.out.println("------------------------------------");

				System.out.println(customer.getId());
				System.out.println(customer.getName());
				System.out.println(customer.getEmail());

				System.out.println("------------------------------------");

			});
		};
	}
}
