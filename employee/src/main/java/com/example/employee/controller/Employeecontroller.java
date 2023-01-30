package com.example.employee.controller;

import com.example.employee.pojo.entity.Employee;
import com.example.employee.service.impl.EmployeeServiceimpl;
import org.apache.http.protocol.HTTP;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.ConnectException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/userinfo")
public class Employeecontroller {
    private  final EmployeeServiceimpl employeeServiceimpl;
    @Autowired
    public Employeecontroller(EmployeeServiceimpl employeeServiceimpl)
    {
        this.employeeServiceimpl=employeeServiceimpl;
    }

    @RequestMapping("/userinfo/all")
    public ResponseEntity<List<Employee>> getAll()
    {
       List<Employee> list=null;
       list=employeeServiceimpl.getAll();
       return  new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResponseEntity Insert_Emp(@RequestParam("id")Integer id,@RequestParam("Fname") String Fname, @RequestParam("Lname")String Lname
            ,@RequestParam("date") String date,@RequestParam("Mname") String Mname) throws ParseException {  Employee employee=new Employee();
        employee.setFname(Fname);
        employee.setLname(Lname);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parseddate=dateFormat.parse(date);
        employee.setDateofBirth(parseddate);
        if(Mname!=null&!Mname.isEmpty())
            employee.setMname(Mname);
        else if(Mname=="")
            employee.setMname(".");
        employeeServiceimpl.Insert_Emp(employee);
      return new ResponseEntity<>("success",HttpStatus.CREATED);

    }


}
