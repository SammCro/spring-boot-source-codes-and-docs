package com.springbootdocssourcecodes.springboot.Part2.Exceptions;

public class StudentMismatchArgumantException extends RuntimeException{
    public StudentMismatchArgumantException(String message) {
        super(message);
    }

    public StudentMismatchArgumantException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentMismatchArgumantException(Throwable cause) {
        super(cause);
    }
}
