package br.com.joaofzm15.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaofzm15.crud.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Giannis", "greekfreak@gmail.com","(11)9999-1234", "50piece");
		return ResponseEntity.ok().body(user);
	}
	
}
