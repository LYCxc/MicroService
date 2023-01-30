package com.example.university.controller;

import com.example.university.pojo.Students;
import com.example.university.pojo.Teachers;
import com.example.university.service.TeachersServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/university")
public class Teacherscontroller {
    private final TeachersServiceimpl teachersServiceimpl;
    @Autowired
    public Teacherscontroller(TeachersServiceimpl teachersServiceimpl)
    {
        this.teachersServiceimpl=teachersServiceimpl;
    }
    @GetMapping("/teachers")
    public ResponseEntity<List<Teachers>> getAll()
    {
        List<Teachers> list=null;
        list=teachersServiceimpl.getAll();
        if(list!=null)
        {
            return new  ResponseEntity<>(list, HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/teahcers/{name}")
    @ResponseBody
    public ResponseEntity<Teachers> getStuByName(@PathVariable String name)
    {   Teachers tch=teachersServiceimpl.getTeacherByName(name);
        if(tch!=null)
        {
            return  new ResponseEntity<>(tch,HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(tch,HttpStatus.NOT_FOUND);
        }
    }
}
