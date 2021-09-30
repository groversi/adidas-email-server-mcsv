package com.adidas.email.server.services.impl;

import com.adidas.email.server.dto.Subscription;
import com.adidas.email.server.services.EmailService;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(EmailServiceImpl.class);

    @Override
    @Async
    public void sendCreateSubscriptionEmail(Subscription subscription) {
        log.info("\nHi {}, you are now subscribed to Adidas newsletter.\n Enjoy it! \n Subscribed email: {} \nSubscription id: {}",
                subscription.getFirstName(),
                subscription.getEmail(),
                subscription.getSubscriptionId());
    }

    @Override
    @Async
    public void sendCancelSubscriptionEmail(Subscription subscription) {
        log.info("\nHi {}, whats happened? You cancelled your subscription. \nSubscription email: {} \nSubscription id: {}",
                subscription.getFirstName(),
                subscription.getEmail(),
                subscription.getSubscriptionId());
    }
}
