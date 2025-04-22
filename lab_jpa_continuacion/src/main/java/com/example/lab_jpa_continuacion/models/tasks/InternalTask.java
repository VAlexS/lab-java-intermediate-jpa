package com.example.lab_jpa_continuacion.models.tasks;



import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "internal_task")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, Date date, boolean status) {
        super(title, date, status);
    }
}
