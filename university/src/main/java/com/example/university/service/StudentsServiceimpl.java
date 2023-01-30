package com.example.university.service;

import com.example.university.pojo.Students;
import com.example.university.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import javax.xml.transform.sax.SAXResult;
import java.util.List;
@Service
public class StudentsServiceimpl implements StudentsService{
    private final StudentsRepository studentsRepository;
    public StudentsServiceimpl(StudentsRepository studentsRepository)
    {
        this.studentsRepository=studentsRepository;
    }
    @Override
    public List<Students> getAll() {
        List<Students> list=null;
        list=studentsRepository.findAll();
        return  list;
    }

    @Override
    public Students getStuByName(String Name) {
        Students stu=null;
        stu=studentsRepository.findStudentsByName(Name);
        return  stu;
    }

    @Override
    public void Insert_Stu(Students stu) {
        studentsRepository.save(stu);
    }

}
