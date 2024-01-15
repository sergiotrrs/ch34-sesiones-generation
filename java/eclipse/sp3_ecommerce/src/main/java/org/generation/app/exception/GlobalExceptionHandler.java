package org.generation.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // Este componente se utiliza para manejar excepciones globalmente
public class GlobalExceptionHandler {

	@ExceptionHandler( IllegalStateException.class )
	ResponseEntity<String> handleIllegalStateException(Exception exception){
		String message = exception.getMessage();
		return new ResponseEntity<>( message, HttpStatus.BAD_REQUEST );
	}
}
