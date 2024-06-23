package com.rahmi.binfood;

import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.rahmi.binfood.repository")
@SpringBootApplication
public class BinfoodApplication {

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUsername;

	@Value("${spring.datasource.password}")
	private String datasourcePassword;

	public static void main(String[] args) {
		SpringApplication.run(BinfoodApplication.class, args);
	}

	@PostConstruct
	public void printDatasourceUrl() {
		System.out.println("Datasource URL: " + datasourceUrl);
		System.out.println("Datasource Username: " + datasourceUsername);
		System.out.println("Datasource Password: " + datasourcePassword);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
