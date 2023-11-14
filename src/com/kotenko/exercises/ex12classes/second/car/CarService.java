package com.kotenko.exercises.ex12classes.second.car;

public class CarService {
    private CarDao carDao;

    public CarService() {
        this.carDao = new CarDao();
    }

    public int registerNewCar(Car car) {
        //logic
        carDao.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return carDao.selectAllCars();
    }
}
