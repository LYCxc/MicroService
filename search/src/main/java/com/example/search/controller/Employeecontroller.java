package com.example.search.controller;

import com.example.search.pojo.EmployeeDto;
import com.example.search.service.EmployeeService;
import com.example.search.service.EmployeeServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@RestController
@ResponseBody
@RequestMapping("/users")
public class Employeecontroller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Employeecontroller.class);
    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    @ResponseBody
    public ResponseEntity getAll() throws InterruptedException {
        try {
            CompletableFuture<List<Object>> list1=employeeService.getAll();
            CompletableFuture<List<Object>> list2=employeeService.getAll();
            CompletableFuture<List<Object>> list3=employeeService.getAll();
            CompletableFuture.allOf(list1, list2, list3).join();
            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (final Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
