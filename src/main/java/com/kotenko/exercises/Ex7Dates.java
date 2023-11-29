package com.kotenko.exercises;

import java.time.LocalDate;
import java.time.Period;

public class Ex7Dates {
    public static void main(String[] args) {
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(LocalDate.now().format(dateFormatter));
//        System.out.println(LocalDateTime.now().format(dateTimeFormatter));

//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println(LocalDate.of(1992, Month.MARCH, 30).format(dateFormatter));

//        System.out.println(LocalDate.of(1992,Month.MARCH, 30).plusDays(100));

//        System.out.println(new Ex7Dates().calculateAge(LocalDate.of(1992, Month.MARCH, 30)));
    }

    private int calculateAge(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());

        int years = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();

        if (month < 0 || (month == 0 && days < 0)) {
            years--;
        }
        return years;
    }
}
