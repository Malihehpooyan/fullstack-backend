package com.maliheh.fullstackbackend.exception;

import com.maliheh.fullstackbackend.exception.UserNotFoundException;
import com.maliheh.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserNotFoundAdvice {

    private UserRepository userRepository;

    @Autowired
    public UserNotFoundAdvice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(UserNotFoundException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", exception.getMessage());
        return errorMap;
    }
}
