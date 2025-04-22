package com.example.lab_jpa_continuacion.models.tasks;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(name = "due_date")
    private Date dueDate;

    private boolean status;

    public Task() {
    }

    public Task(String title, Date date, boolean status) {
        setTitle(title);
        setDueDate(date);
        setStatus(status);
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final Date getDueDate() {
        return dueDate;
    }

    public final void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public final boolean isStatus() {
        return status;
    }

    public final void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + dueDate +
                ", status=" + status +
                '}';
    }
}
