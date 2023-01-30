package com.example.search.controller;

import com.example.employee.pojo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private  final RestTemplate restTemplate;
    @Autowired
    public  SearchController(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }

    @GetMapping("/weather/search")
    public ResponseEntity<?> getDetails() {
        //TODO
        return new ResponseEntity<>("this is search service", HttpStatus.OK);
    }



}