package com.example.crud.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class StudentExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ExceptionDto handler (NotFoundException exception){
        log.error("ActionLog.handler.error not found exception: {}",exception.getMessage());
        return new ExceptionDto(HttpStatus.NOT_FOUND.value(),exception.getMessage());

    }

}
