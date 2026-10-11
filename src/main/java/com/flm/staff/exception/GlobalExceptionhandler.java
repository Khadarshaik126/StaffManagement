package com.flm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionhandler {
	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<String> doctornotfound(DoctorNotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getLocalizedMessage());
	}
	@ExceptionHandler(StaffNotFoundException.class)
	public ResponseEntity<String> staffnotfound(StaffNotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getLocalizedMessage());
	}
	@ExceptionHandler(DoctorUnavailableException.class)
	public ResponseEntity<String> accountnotfound(DoctorUnavailableException ex) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getLocalizedMessage());
	}
}
