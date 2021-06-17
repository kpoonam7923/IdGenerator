package com.idgenerators.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.idgenerators.demo.entities.Employee;

public interface EmployeeRepos extends CrudRepository<Employee, Integer> {

}
