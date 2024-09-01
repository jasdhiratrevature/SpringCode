package com.revature.springboot.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.springboot.jpa.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	List<Customer> findByLastName(String lastName);
}
