package com.kotenko.oop.practice.person;

import com.kotenko.oop.practice.Address;
import com.kotenko.oop.practice.House;
import com.kotenko.oop.practice.car.Car;
import com.kotenko.oop.practice.cat.Cat;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cats;
    private Car car;
    private House house;
    private Address address;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, Cat[] cats, Car car, House house, Address address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;
        this.car = car;
        this.house = house;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                ", car=" + car +
                ", house=" + house +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
