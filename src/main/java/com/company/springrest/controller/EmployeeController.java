package com.company.springrest.controller;

import com.company.springrest.rest.model.dto.EmployeeDto;
import com.company.springrest.rest.model.response.EmployeeResponse;
import com.company.springrest.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Tag(name = "Employee services")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping()
//    @PreAuthorize("hasRole('ADMIN')")
    public EmployeeResponse getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
//    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public EmployeeDto getEmployee(@PathVariable("id") long id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/search")
    public EmployeeResponse getEmployeeByNameAndSurname(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname){
        return employeeService.getEmployeeByNameAndSurname(name,surname);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  void insert(@Valid @RequestBody EmployeeDto employeeDto){
        employeeService.insert(employeeDto);
    }

    @PutMapping("/{id}")
    public void updateAll(@RequestBody EmployeeDto employeeDto,@PathVariable("id") long id){
            employeeService.update(employeeDto,id);
    }

   @PatchMapping("/{id}")
    public void updateSome(@RequestBody EmployeeDto employeeDto,@PathVariable("id") long id){
            employeeService.updateSome(employeeDto,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id){
            employeeService.delete(id);
    }

}
