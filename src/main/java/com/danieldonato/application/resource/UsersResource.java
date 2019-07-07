package com.danieldonato.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danieldonato.application.model.User;
import com.danieldonato.application.repository.UserRepository;

/**
 * 
 * Camada de controller apenas para fins de teste com a authorização
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	
	@Autowired
	private UserRepository repo;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.ok().body(repo.findAll());
	}
	
}
