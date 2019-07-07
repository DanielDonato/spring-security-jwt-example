package com.danieldonato.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.danieldonato.application.model.User;
import com.danieldonato.application.model.enuns.PerfilEnum;
import com.danieldonato.application.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityExampleWithJwtApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityExampleWithJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User obj = new User(null, "daniel@gmail.com", pe.encode("123"));
		obj.addPerfil(PerfilEnum.ADMIN);
		repo.save(obj);
	}
}
