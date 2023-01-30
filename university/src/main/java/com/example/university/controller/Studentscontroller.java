package com.example.university.controller;

import com.example.university.pojo.Students;
import com.example.university.service.StudentsServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/university")
public class Studentscontroller {
    private final StudentsServiceimpl studentsServiceimpl;
    @Autowired
    public Studentscontroller(StudentsServiceimpl studentsServiceimpl)
    {
        this.studentsServiceimpl=studentsServiceimpl;
    }
    @GetMapping("/students")
    public ResponseEntity<List<Students>> getAll()
    {
        List<Students> list=null;
        list=studentsServiceimpl.getAll();
        if(list!=null)
        {
            return new  ResponseEntity<>(list, HttpStatus.OK);
        }
        else
        {
          return  new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/students/{name}")
    @ResponseBody
    public ResponseEntity<Students> getStuByName(@PathVariable String name)
    {   Students stu=studentsServiceimpl.getStuByName(name);
        if(stu!=null)
        {
            return  new ResponseEntity<>(stu,HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(stu,HttpStatus.NOT_FOUND);
        }
    }

}
