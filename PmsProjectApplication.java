package com.PMSProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.PMSProjectDao")
@EntityScan("com.PMSProject.Model")
@ComponentScans(value= {@ComponentScan("com"),@ComponentScan("com.PMSProjectcontrollers"),
		@ComponentScan("com.PMSProjectDao"),@ComponentScan("com.PMSProjectService")})
public class PmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsProjectApplication.class, args);
	}
}