package com.example.crud.dao.repository;

import com.example.crud.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
