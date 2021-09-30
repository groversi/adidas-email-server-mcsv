package com.adidas.email.server.services;

import com.adidas.email.server.services.impl.AuthenticationServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticationServiceTest {

    @InjectMocks
    private AuthenticationServiceImpl authenticationService;

    @Test
    public void testShouldRefuseAnInvalidToken() {
        Assert.assertFalse(authenticationService.validateJwtToken("someToken"));
    }

}
