package com.example.wbdvsp21teamserverjava.exception;

import com.mysql.cj.exceptions.PasswordExpiredException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserValidationExceptionHandler {

    @ExceptionHandler({UserExitedException.class, PasswordExpiredException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleUserExistedException(UserExitedException ex) {
        Map<String, String> result = new HashMap<>();
        result.put("Message:", ex.getMessage());
        return result;
    }
}
