package com.example.lab_jpa_continuacion;

import com.example.lab_jpa_continuacion.models.tasks.BillAbleTask;
import com.example.lab_jpa_continuacion.models.tasks.InternalTask;
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

}
