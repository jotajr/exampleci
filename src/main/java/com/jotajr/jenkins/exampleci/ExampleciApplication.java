package com.jotajr.jenkins.exampleci;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleciApplication {

	private static Logger LOG = LoggerFactory
			.getLogger(ExampleciApplication.class);

	public static void main(String[] args) {
		LOG.info("Iniciando a aplicacao");
		SpringApplication.run(ExampleciApplication.class, args);
		LOG.info("Final da aplicacao");
	}

	public void run(String... args) {
		LOG.info("Executando a aplicacao");
	}

}
