package com.kotenko.oop.inheritance;

import java.util.Objects;

public class Employee {
    protected String name;
    protected String address;
    protected int age;
    protected String experience;

    public Employee(String name, String address, int age, String experience) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.experience = experience;
    }

    public void sayHi(){
        System.out.println("My name is: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", experience='" + experience + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(experience, employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age, experience);
    }
}
