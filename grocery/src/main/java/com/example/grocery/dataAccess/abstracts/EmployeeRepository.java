package com.example.grocery.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.entity.concretes.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    boolean existsByNationalIdentity(String nationIdentity);
}