package com.example.university.pojo;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "student")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer stid;

    @Column(name = "Name")
    private  String Name;

    @Column(name = "Age")
    private  String Age;
}
