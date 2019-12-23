package com.ctdev.task3.project.model;

public class Employee {
    private double ratePerHour;
    private int workdays;
    private double salary;
    private Position position;

    public Employee(double ratePerHour, int workdays, Position position) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.position = position;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
