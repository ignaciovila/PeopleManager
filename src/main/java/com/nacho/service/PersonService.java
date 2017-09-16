package com.nacho.service;

import com.nacho.model.Person;
import com.nacho.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeople() {
        return (List<Person>) personRepository.findAll();
    }

    public void save(Person p) {
        personRepository.save(p);
    }
}
