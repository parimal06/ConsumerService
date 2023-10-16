package com.app.consumer.ConsumerService.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandlers.class);

    @ExceptionHandler(NoSuchElementException.class)
    protected ResponseEntity<Object> handleNoValException(RuntimeException re, WebRequest request){

        String response = "No Value Present!!";
        logger.error(re.getMessage());
        return handleExceptionInternal(re,response,new HttpHeaders(), HttpStatus.OK,  request);

    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleGenericException(RuntimeException re, WebRequest request){

        String response = "Please try again!!";
        logger.error(re.getMessage());
        return handleExceptionInternal(re,response,new HttpHeaders(), HttpStatus.OK,  request);

    }

}
