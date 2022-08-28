package com.dh.idade.controller;

import com.dh.idade.service.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    PersonService personService = new PersonService();

    @GetMapping("/{day}/{month}/{year}")
    public int getAge(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return personService.calculateAge(day, month, year);
    }
}
