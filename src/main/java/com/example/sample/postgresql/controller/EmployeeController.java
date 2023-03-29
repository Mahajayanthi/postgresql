package com.example.sample.postgresql.controller;

import com.example.sample.postgresql.entity.Employee;
import com.example.sample.postgresql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/save")
    public Employee save(@RequestBody Employee emp){
    return service.save(emp);
    }
    @GetMapping("/getall")
    private List<Employee> getAllEmployees()
    {
        return service.getAllEmployees();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/get/{id}")
    private Employee getBooks(@PathVariable("id") int id)
    {
        return service.getEmployeeById(id);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/delete/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        service.delete(id);
    }
    //creating post mapping that post the book detail in the database

    //creating put mapping that updates the book detail
    @PutMapping("/update")
    private Employee update(@RequestBody Employee emp)
    {
       service.saveOrUpdate(emp);
        return emp;
    }
}







