package com.kotenko.oop.di;

public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDao();
        EmailService emailService = new EmailService();
        MotService motService = new MotService(emailService);

        CarService carService = new CarService(carDao, emailService, motService);

    }
}
