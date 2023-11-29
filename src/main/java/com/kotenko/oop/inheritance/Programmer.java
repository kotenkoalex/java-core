package com.kotenko.oop.inheritance;

public class Programmer extends Employee {
    private String[] programmingLanguages;

    public Programmer(String name, String address, int age, String experience) {
        super(name, address, age, experience);
    }

    public Programmer(String name, String address, int age, String experience, String[] programmingLanguages) {
        super(name, address, age, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode() {
        super.sayHi();
        System.out.println(this.name + ": Writing some code");
    }

    @Override
    public void sayHi() {
        var msg = """
                "My name is: %s"
                I am a programmer
                """.formatted(this.name);
        System.out.println(msg);
    }
}
