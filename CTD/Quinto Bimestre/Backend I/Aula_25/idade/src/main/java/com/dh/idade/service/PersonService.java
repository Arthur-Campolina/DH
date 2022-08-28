package com.dh.idade.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class PersonService {

    public int calculateAge(int day, int month, int year) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        Period period = Period.between(birthday,now);
        return period.getYears();
    }
}
