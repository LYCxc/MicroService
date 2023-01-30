package com.example.search.service;

import com.example.employee.pojo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@Service
public interface EmployeeService {
   public CompletableFuture<List<Object>> getAll() throws InterruptedException;
}
