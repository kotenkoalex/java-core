package com.kotenko.oop.di;

public class CarService {
    private CarDao carDao;
    private EmailService emailService;

    private MotService motService;

    public CarService(CarDao carDao, EmailService emailService, MotService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService = motService;
    }
}
