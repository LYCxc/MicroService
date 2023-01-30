package com.example.university.service;

import com.example.university.pojo.Students;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentsService {
   List<Students> getAll();

   Students getStuByName(@Param("name") String Name);
   void Insert_Stu(Students stu);
}
