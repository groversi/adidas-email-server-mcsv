package com.adidas.email.server.dto;

import com.adidas.email.server.util.GenderEnum;

import java.time.LocalDate;

public class Subscription {

    private String subscriptionId;
    private Boolean enabled;
    private String email;
    private String firstName;
    private GenderEnum gender;
    private LocalDate dateOfBirth;
    private Boolean subscriptionConsent;
    private Integer campaignId;


    public Subscription(){}

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Boolean getSubscriptionConsent() {
        return subscriptionConsent;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
