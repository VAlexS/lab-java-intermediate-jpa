package com.example.lab_jpa_continuacion.repositories.contacts;

import com.example.lab_jpa_continuacion.models.contacts.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contact, Integer> {
}
