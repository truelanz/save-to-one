package com.truelanz.toone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truelanz.toone.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
