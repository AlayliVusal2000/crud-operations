package com.example.crud.service.impl;

import com.example.crud.dao.entity.StudentEntity;
import com.example.crud.dao.repository.StudentRepository;
import com.example.crud.exception.NotFoundException;
import com.example.crud.model.dto.StudentDto;
import com.example.crud.model.mapper.StudentMapper;
import com.example.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private static List<StudentDto> studentDtoList = new ArrayList<>();

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {

       studentRepository.deleteById(id);

    }

    @Override
    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }


    @Override
    public StudentDto getStudentById(Long id) {
        StudentEntity studentEntity = studentRepository
                .findById(id).orElseThrow(() -> new NotFoundException("Student not found!"));
        return StudentMapper.INSTANCE.mapEntityToDto(studentEntity);
    }


    @Override
    public List<StudentDto> getStudents() {
        List<StudentEntity> studentEntityList = studentRepository.findAll();
        return StudentMapper.INSTANCE.mapToEntityListToDtoList(studentEntityList);
    }
}
