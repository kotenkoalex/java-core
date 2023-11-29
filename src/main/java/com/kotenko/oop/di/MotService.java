package com.kotenko.oop.di;

public class MotService {
    private EmailService emailService;

    public MotService(EmailService emailService) {
        this.emailService = emailService;
    }
}
