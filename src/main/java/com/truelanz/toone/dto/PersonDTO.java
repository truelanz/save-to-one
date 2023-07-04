package com.truelanz.toone.dto;

import com.truelanz.toone.entities.Person;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonDTO {
    
    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentId = entity.getDepartment().getId();
    }
}
