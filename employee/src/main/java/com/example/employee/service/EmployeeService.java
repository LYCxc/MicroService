package com.example.employee.service;

import com.example.employee.pojo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
  List<Employee> getAll();
  void Insert_Emp(Employee employee);
}
