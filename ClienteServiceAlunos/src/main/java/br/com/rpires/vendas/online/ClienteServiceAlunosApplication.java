package br.com.rpires.vendas.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class ClienteServiceAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServiceAlunosApplication.class, args);
	}
}
