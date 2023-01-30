package com.example.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@Service
public class EmployeeServiceimpl implements  EmployeeService{

    private  final RestTemplate restTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceimpl.class);
    @Autowired
    public EmployeeServiceimpl(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }

    private  String url="http://localhost:8089/userinfo/all";

    @Override
    @Async
    public CompletableFuture<List<Object>> getAll() throws InterruptedException {

        return  CompletableFuture.completedFuture(restTemplate.getForObject(url,List.class));
    }
}
