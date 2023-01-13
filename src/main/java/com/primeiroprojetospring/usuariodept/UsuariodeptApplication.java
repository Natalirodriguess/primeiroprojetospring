package com.primeiroprojetospring.usuariodept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication()
public class UsuariodeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariodeptApplication.class, args);
	}

}
