package com.example.lab_jpa_continuacion;

import com.example.lab_jpa_continuacion.models.contacts.Contact;
import com.example.lab_jpa_continuacion.models.contacts.Name;
import com.example.lab_jpa_continuacion.models.tasks.BillAbleTask;
import com.example.lab_jpa_continuacion.models.tasks.InternalTask;
import com.example.lab_jpa_continuacion.repositories.contacts.ContactsRepository;
import com.example.lab_jpa_continuacion.repositories.tasks.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LabJpaContinuacionApplicationTests {

	@Autowired
	TaskRepository taskRepository;

	@Autowired
	ContactsRepository contactsRepository;

	@Test
	@DisplayName("Guardar una task interna")
	void saveInternalTasks() {

		InternalTask internalTask = new InternalTask("Ejercicio Task", new Date(2025, 4, 22), true);

		System.out.println("=======================");
		System.out.println("La task que vas a guardar es ");
		System.out.println(internalTask);
		System.out.println("=======================");

		var taskSaved = taskRepository.save(internalTask);

		assertNotNull(taskSaved);
	}


	@Test
	@DisplayName("Guardar una billable task")
	void saveBillAbleTask(){

		BillAbleTask billAbleTask = new BillAbleTask("Ejercicio Task", new Date(2025, 4, 22), false, 680);

		System.out.println("=======================");
		System.out.println("La task que vas a guardar es ");
		System.out.println(billAbleTask);
		System.out.println("=======================");

		var taskSaved = taskRepository.save(billAbleTask);

		assertNotNull(taskSaved);

	}

	@Test
	@DisplayName("Guardar un contact en la base de datos")
	void saveContact(){

		Contact contact = new Contact(new Name("Victor", "Alejandro", "Sanz", "mr"),
				"Developer", "ODS");

		System.out.println("=======================");
		System.out.println("El contacto que vas a guardar es ");
		System.out.println(contact);
		System.out.println("=======================");

		var contactSaved = contactsRepository.save(contact);

		assertNotNull(contactSaved);

	}

	@Test
	@DisplayName("Guardar un contact en la base de datos sin middleName")
	void saveContactWithoutMiddleName(){

		Contact contact = new Contact(new Name("Fernando", null, "Sanchez", "dr"),
				"Profesor", "ISEP CEU");

		System.out.println("=======================");
		System.out.println("El contacto que vas a guardar es ");
		System.out.println(contact);
		System.out.println("=======================");

		var contactSaved = contactsRepository.save(contact);

		assertNotNull(contactSaved);

		var contactFound = contactsRepository.findById(2);

		assertTrue(contactFound.isPresent());

		assertNull(contactFound.get().getName().getMiddleName());
	}

}
