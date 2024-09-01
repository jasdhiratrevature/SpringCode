package com.jasdhir.springdata.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

  @Id // used to indicate field is the primary key
  @GeneratedValue // used to indicate property should be auto-generated
  private Integer id;

  private String firstName;
  private String lastName;

  // default constructor - for use by Spring JPA
	
	//  public Customer() { super(); }// TODO Auto-generated constructor sub }
	 

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

	/*
	 * @Override public String toString() { return "Customer[id=" + id +
	 * ", firstName=" + firstName + ", lastName=" + lastName + "]"; }
	 * 
	 * 
	 * 
	 * public void setId(Integer id) { this.id = id; }
	 * 
	 * public String getFirstName() { return firstName; }
	 * 
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setLastName(String lastName) { this.lastName = lastName; }
	 * 
	 * 
	 * public Integer getId() { // TODO Auto-generated method stub return id; }
	 * 
	 */
}

