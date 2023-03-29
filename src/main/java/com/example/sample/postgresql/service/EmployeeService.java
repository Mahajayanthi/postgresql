package com.example.sample.postgresql.service;

import com.example.sample.postgresql.entity.Employee;
import com.example.sample.postgresql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;
    public Employee save(Employee emp) {
return repo.save(emp);
    }
    public List<Employee> getAllEmployees()
    {
        List<Employee> books = new ArrayList<Employee>();
        repo.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
    //getting a specific record by using the method findById() of CrudRepository
//    public Employee getEmployeesById(int id)
//    {
//        return repo.findById(id).get();
//    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Employee emp)
    {
        repo.save(emp);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        repo.deleteById(id);
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).get();
    }

//    public Employee getEmployeeById(int id) {
//        return repo.findById(id).get();
//    }


    //updating a record

}
