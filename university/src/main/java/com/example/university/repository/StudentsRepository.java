package com.example.university.repository;

import com.example.university.pojo.Students;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StudentsRepository extends JpaRepository<Students,Long> {

    @Transactional
    @Modifying
    @Query("select t from Students t where t.Name=:name")
    Students findStudentsByName(@Param("name")String name);

}
