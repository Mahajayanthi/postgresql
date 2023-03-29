package com.example.sample.postgresql.repository;

import com.example.sample.postgresql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findEmployeeById(int id);
}
