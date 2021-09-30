package com.adidas.email.server.services;

import com.adidas.email.server.dto.Subscription;


public interface EmailService {

    void sendCreateSubscriptionEmail(Subscription subscription);

    void sendCancelSubscriptionEmail(Subscription subscription);

}
