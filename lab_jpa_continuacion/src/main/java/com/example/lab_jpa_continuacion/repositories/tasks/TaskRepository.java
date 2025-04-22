package com.example.lab_jpa_continuacion.repositories.tasks;

import com.example.lab_jpa_continuacion.models.tasks.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
