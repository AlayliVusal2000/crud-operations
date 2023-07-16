package com.example.crud.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;

@RequiredArgsConstructor
public final class ExceptionDto {
private final Integer code;
private final String message;


}
