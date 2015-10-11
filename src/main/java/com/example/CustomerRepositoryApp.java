package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;

@EnableAutoConfiguration
@ComponentScan
public class CustomerRepositoryApp implements CommandLineRunner {

	@Autowired
//    CustomerJdbcRepository customerRepository;
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception {
        Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
        System.out.println(created + " is created!");

        customerRepository.findAll()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerRepositoryApp.class, args);
    }
}
