package com.example.university.pojo;

import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "teacher")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "Name")
    private  String Name;

    @Column(name = "Age")
    private  String Age;
}
