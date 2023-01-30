package com.example.employee.service.impl;

import com.example.employee.pojo.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceimpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceimpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository=employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list=null;
        list=employeeRepository.findAll();
        return  list;
    }
    @Transactional
    @Override
    public void Insert_Emp(Employee employee) {
       employeeRepository.save(employee);
    }
}
