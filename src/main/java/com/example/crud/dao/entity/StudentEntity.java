package com.example.crud.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")

    String name;
    @Column(name = "surname")

    String surname;
    @Column(name = "age")

    private Integer age;
    @Column(name = "university")

    String university;
    @Column(name = "email")

    String email;

    @Column(name = "birthDate")
    LocalDate birthDate;

    @Column(name = "finCode")
    String finCode;


}
