package org.generation.app.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice // Este componente se utiliza para manejar excepciones globalmente
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	ErrorDetails errorDetails;
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
							MethodArgumentNotValidException ex,
							HttpHeaders headers, 
							HttpStatusCode status, 
							WebRequest request
							) {
		Map<String, String> errors = new HashMap<>();
		List<ObjectError> errorList = ex.getBindingResult().getAllErrors();
		
		errorList.forEach( error -> {
			String fieldName = ((FieldError)error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});
		
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(IllegalStateException.class)
	ResponseEntity<ErrorDetails> handleIllegalStateException(Exception exception, WebRequest webRequest) {
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("RESOURCE_NOT_FOUND");

		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
}
