package com.ctdev.task3.project.model;


import com.ctdev.task3.project.service.SalaryService;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double budget;
    private List<Employee> employees = new ArrayList<>();
    private SalaryService salaryService;

    public Company(String name, double budget, SalaryService salaryService) {
        this.name = name;
        this.budget = budget;
        this.salaryService = salaryService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public SalaryService getSalaryService() {
        return salaryService;
    }

    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }
}
