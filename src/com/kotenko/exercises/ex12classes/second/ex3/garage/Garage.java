package com.kotenko.exercises.ex12classes.second.ex3.garage;

import com.kotenko.exercises.ex12classes.second.ex3.car.Car;

public record Garage(Long id, Car[] cars) {
}
