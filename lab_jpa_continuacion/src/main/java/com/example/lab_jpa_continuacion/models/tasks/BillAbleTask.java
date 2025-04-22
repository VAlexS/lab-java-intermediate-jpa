package com.example.lab_jpa_continuacion.models.tasks;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "billable_task")
@PrimaryKeyJoinColumn(name = "id")
public class BillAbleTask extends Task {


    private double hourlyRate;

    public BillAbleTask() {
    }

    public BillAbleTask(String title, Date date, boolean status, double hourlyRate) {
        super(title, date, status);
        setHourlyRate(hourlyRate);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString()+"BillAbleTask{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
