package com.example.lab_jpa_continuacion.models.contacts;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable //esto indica que va a estar anidado en una tabla ya existente, no es una entidad como tal
public class Name {

    @Column(name = "first_name", nullable = false) //si no especifico el nullable, por defecto es true
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String saludation;

    public Name() {
    }

    public Name(String firstName, String middleName, String lastName, String saludation) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setSaludation(saludation);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSaludation() {
        return saludation;
    }

    public void setSaludation(String saludation) {
        this.saludation = saludation;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", saludation='" + saludation + '\'' +
                '}';
    }
}
