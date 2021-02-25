package com.irrt.spring.jpa_crud.service;



import com.irrt.spring.jpa_crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}