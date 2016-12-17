package br.eti.gregori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing
public class DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoApplication.class, args);
	}
}
