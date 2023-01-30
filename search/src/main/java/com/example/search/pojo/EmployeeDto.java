package com.example.search.pojo;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
   @Id
   @Column(name = "id",nullable = false)
   private Integer id;
   @Column(name = "FIRST_NAME",nullable = false)
   private String Fname;
   @Column(name = "MIIDDLE_NAME")
   private String Mname;
   @Column(name = "LAST_NAME",nullable = false)
   private String Lname;
   @Column(name = "DOB",nullable = false)
   private Date   DateofBirth;
}
