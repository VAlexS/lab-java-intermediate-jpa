package com.example.lab_jpa_continuacion.models.contacts;

import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Embedded
    private Name name;

    @Column(nullable = false)
    private String tittle;

    @Column(nullable = false)
    private String company;

    public Contact() {
    }

    public Contact(Name name, String tittle, String company) {
        setName(name);
        setTittle(tittle);
        setCompany(company);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name=" + name +
                ", tittle='" + tittle + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
