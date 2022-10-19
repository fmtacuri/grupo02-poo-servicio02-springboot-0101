package com.grupo02.SceneryOne.exception;

import static lombok.AccessLevel.PRIVATE;

import lombok.experimental.FieldDefaults;

@FieldDefaults(level = PRIVATE, makeFinal = true)
public class InternalErrorException extends RuntimeException {

}
