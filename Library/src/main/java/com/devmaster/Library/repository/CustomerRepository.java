package com.devmaster.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaster.Library.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
