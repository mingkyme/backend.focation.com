package com.focation.backend.common.excepction.repository;

public class DBNotFoundException extends Exception {
    public DBNotFoundException(String message) {
        super(message);
    }
}
