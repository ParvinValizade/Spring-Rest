package com.company.springrest.service;

import com.company.springrest.rest.model.dto.EmployeeDto;
import com.company.springrest.rest.model.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse getAllEmployees();
    EmployeeDto getEmployee(long id);
    EmployeeResponse getEmployeeByNameAndSurname(String name,String surname);
    void insert(EmployeeDto employeeDto);
    void update(EmployeeDto employeeDto, long id);
    void updateSome(EmployeeDto employeeDto, long id);
    void delete(long id);
}
