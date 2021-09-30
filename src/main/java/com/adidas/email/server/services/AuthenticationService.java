package com.adidas.email.server.services;

public interface AuthenticationService {

    Boolean validateJwtToken(String jwtToken);
}
