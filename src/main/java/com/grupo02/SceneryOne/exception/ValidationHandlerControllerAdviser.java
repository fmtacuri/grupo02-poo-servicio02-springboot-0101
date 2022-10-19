package com.grupo02.SceneryOne.exception;

import com.grupo02.SceneryOne.domain.dto.ErrorDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class ValidationHandlerControllerAdviser {

  @ResponseBody
  @ExceptionHandler({MethodArgumentNotValidException.class})
  ResponseEntity<Object> onMethodArgumentTypeMismatchException(
      MethodArgumentNotValidException exception) {
    log.error("Error in validation message: {}", exception.getMessage());
    return new ResponseEntity<>(ErrorDto.builder().message(exception.getMessage()).build(),
        HttpStatus.BAD_REQUEST);
  }

  @ResponseBody
  @ExceptionHandler(InternalErrorException.class)
  ResponseEntity<Object> onInternalErrorException() {
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ResponseBody
  @ExceptionHandler(NotFoundException.class)
  ResponseEntity<Object> onNotFoundException(NotFoundException exception) {
    return new ResponseEntity<>(exception.getErrorDto(), HttpStatus.NOT_FOUND);
  }
}
