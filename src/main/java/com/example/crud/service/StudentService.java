package com.example.crud.service;

import com.example.crud.dao.entity.StudentEntity;
import com.example.crud.model.dto.StudentDto;

import java.util.List;

public interface StudentService {

    StudentEntity createStudent(StudentEntity studentEntity);

    void deleteStudent(Long id);
    void deleteAllStudents();

    StudentDto getStudentById(Long id);


    List<StudentDto> getStudents();

}
