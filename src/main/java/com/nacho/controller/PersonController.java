package com.nacho.controller;

import com.nacho.model.Person;
import com.nacho.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/people")
    public List<Person> getListOfPeople() {
        return personService.getPeople();
    }

    @RequestMapping("/add") // Map ONLY GET Requests
    public @ResponseBody String addNewPerson (@RequestParam String name,
                                              @RequestParam String dni) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Person p = new Person();
        p.setName(name);
        p.setDni(dni);
        personService.save(p);
        return "Saved";
    }
}
