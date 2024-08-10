package com.example.todo_list.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BackendException extends ResponseStatusException {
    public BackendException(String status) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, status);
    }
}
