package br.com.joaofzm15.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaofzm15.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

