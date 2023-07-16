package com.example.crud.model.mapper;

import com.example.crud.model.dto.StudentDto;
import com.example.crud.dao.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto mapEntityToDto(StudentEntity studentEntity);

    List<StudentDto> mapToEntityListToDtoList(List<StudentEntity> studentEntityList);
}
