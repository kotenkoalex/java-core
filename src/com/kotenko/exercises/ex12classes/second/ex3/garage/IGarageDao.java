package com.kotenko.exercises.ex12classes.second.ex3.garage;

import com.kotenko.exercises.ex12classes.second.ex3.car.Car;

public interface IGarageDao {
    void putCarToGarage(Long garageId, Car car);
}
