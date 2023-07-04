package com.truelanz.toone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truelanz.toone.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
