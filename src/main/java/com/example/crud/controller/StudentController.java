package com.example.crud.controller;


import com.example.crud.dao.entity.StudentEntity;
import com.example.crud.model.dto.StudentDto;
import com.example.crud.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/crud")
public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping("/get")
    public StudentDto getStudentById(Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete")
    public void deleteStudentById(Long id) {
        studentService.deleteStudent(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllStudents() {
        studentService.deleteAllStudents();
    }

    @GetMapping("getAll")
    public List<StudentDto> getAllStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/save")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.createStudent(studentEntity);
    }

}
