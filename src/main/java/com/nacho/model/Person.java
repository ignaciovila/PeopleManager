package com.nacho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String dni;
    private String name;
    private String surname;
    private Calendar birthDate;

    public Person() {
    }

    public Person(Integer id, String dni, String name, String surname, Calendar birthDate) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }
}
