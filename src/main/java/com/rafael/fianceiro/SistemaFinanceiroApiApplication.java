package com.rafael.fianceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.rafael.fianceiro.config.property.FinanceiroApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinanceiroApiProperty.class)
public class SistemaFinanceiroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFinanceiroApiApplication.class, args);
	}

}
