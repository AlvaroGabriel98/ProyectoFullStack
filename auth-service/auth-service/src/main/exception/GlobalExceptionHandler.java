package com.ms_auth.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> manejarRuntime(RuntimeException ex) {
        // En Auth, si quieres ser más preciso, podrías usar .status(401)
        // pero .badRequest() (400) funciona igual de bien para este nivel.
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}