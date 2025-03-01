package com.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@Slf4j
@SpringBootApplication
public class EmployeePayrollAppApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
		log.info("Employee Payroll Application has started successfully in environment: {}", context.getEnvironment().getProperty("environment"));
		log.info("Employee payroll db_user is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
	}
}
