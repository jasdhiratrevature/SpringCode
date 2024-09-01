package com.jasdhir.springdata.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jasdhir.springdata.jpa.model.Customer;

/*
 * Note that the generics for the JpaRepository should match the associated
 * model followed by the datatype of its id
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  List<Customer> findByLastName(String lastName);

  Optional<Customer> findById(Integer id);
  
  @Query("SELECT c FROM Customer c WHERE c.lastName like  'Singh'")
  List<Customer> findAllLastName();

}
