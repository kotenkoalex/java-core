package com.kotenko.exercises.ex12classes.second.ex3.garage;

import com.kotenko.exercises.ex12classes.second.ex3.car.Car;

public class GarageService {
    IGarageDao garageDao;

    public GarageService(IGarageDao garageDao) {
        this.garageDao = garageDao;
    }

    public void putCarToGarage(Long garageId, Car car) {
        garageDao.putCarToGarage(garageId, car);
    }


}
