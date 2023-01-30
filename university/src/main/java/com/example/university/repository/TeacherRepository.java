package com.example.university.repository;

import com.example.university.pojo.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TeacherRepository extends JpaRepository<Teachers,Long> {

    @Query("select t from Teachers t where t.Name=:name")
    Teachers findTeachersByName(@Param("name") String name);
}
