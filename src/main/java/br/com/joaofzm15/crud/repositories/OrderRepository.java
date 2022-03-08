package br.com.joaofzm15.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaofzm15.crud.entities.Order;

//No need to @Repository, since this class extends JpaRepository, which is already @Repository
// This class has methods like findAll and findById that it gets from it's super class
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

