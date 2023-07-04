package com.truelanz.toone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.truelanz.toone.dto.PersonDepartmentDTO;
import com.truelanz.toone.entities.Department;
import com.truelanz.toone.entities.Person;
import com.truelanz.toone.repositories.DepartmentRepository;
import com.truelanz.toone.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public List<PersonDepartmentDTO> findAll() {
        List<Person> result = personRepository.findAll();
        return result.stream().map(x -> new PersonDepartmentDTO(x)).toList();
    }
    
    @Transactional
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        // id e nome
        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        //nome e id
        /* Department dept = new Department();
        dept.setId(dto.getDepartment().getId()); */

        entity.setDepartment(dept);
        entity = personRepository.save(entity);
        return new PersonDepartmentDTO(entity);
    }

}
