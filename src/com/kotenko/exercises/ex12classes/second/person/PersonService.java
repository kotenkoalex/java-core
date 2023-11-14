package com.kotenko.exercises.ex12classes.second.person;

import com.kotenko.exercises.ex12classes.second.utils.StringUtils;

public class PersonService {

    public int addPerson(Person person) {
        if (StringUtils.isEmpty(person.getFirstName())) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        return 1;
    }
}
