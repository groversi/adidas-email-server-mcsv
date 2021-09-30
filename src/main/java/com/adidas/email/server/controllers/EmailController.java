package com.adidas.email.server.controllers;

import com.adidas.email.server.dto.Subscription;
import com.adidas.email.server.services.EmailService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class EmailController {

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    @Autowired
    private EmailService emailService;


    @PostMapping(value = "/subscription/create-subscription")
    @ApiOperation(value = "Send subscription creation email")
    @ApiImplicitParam(name = "Authorization", value = "Access Token", required = true)
    public ResponseEntity<?> createSubscriptionEmail(
            @RequestBody Subscription subscriptionDTO) {

        log.info("Send create subscription email request received");
        emailService.sendCreateSubscriptionEmail(subscriptionDTO);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/subscription/cancel-subscription")
    @ApiOperation(value = "Send subscription exclusion email")
    @ApiImplicitParam(name = "Authorization", value = "Access Token", required = true)
    public ResponseEntity<?> cancelSubscriptionEmail(
            @RequestBody Subscription subscriptionDTO) {

        log.info("Send cancel subscription email request received");
        emailService.sendCancelSubscriptionEmail(subscriptionDTO);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
