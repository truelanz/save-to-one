package com.truelanz.toone.dto;

import com.truelanz.toone.entities.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        name = entity.getName();
    }

    
}
