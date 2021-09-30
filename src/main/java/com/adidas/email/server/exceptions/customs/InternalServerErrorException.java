package com.adidas.email.server.exceptions.customs;


public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String errorMessage){
        super(errorMessage);
    }
}
