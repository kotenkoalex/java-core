package com.kotenko.oop.practice.person;

import com.kotenko.oop.practice.utils.StringUtils;

public class PersonService {

    public int addPerson(Person person) {
        if (StringUtils.isEmpty(person.getFirstName())) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        return 1;
    }
}
