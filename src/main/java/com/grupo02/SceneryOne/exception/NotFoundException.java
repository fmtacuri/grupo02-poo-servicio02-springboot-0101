package com.grupo02.SceneryOne.exception;

import static lombok.AccessLevel.PRIVATE;

import com.grupo02.SceneryOne.domain.dto.ErrorDto;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = PRIVATE, makeFinal = true)
public class NotFoundException extends RuntimeException {

  @Getter
  final ErrorDto errorDto;

  public NotFoundException(String message) {
    this.errorDto = ErrorDto.builder().message(message).build();
  }
}
