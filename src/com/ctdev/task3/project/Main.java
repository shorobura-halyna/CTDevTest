package com.ctdev.task3.project;

import com.ctdev.task3.project.model.Company;
import com.ctdev.task3.project.model.Employee;
import com.ctdev.task3.project.service.SalaryService;
import com.ctdev.task3.project.service.impl.BasicSalaryService;

import static com.ctdev.task3.project.model.Position.*;

public class Main {
    public static void main(String[] args) {
        SalaryService salaryService = new BasicSalaryService();
        Company company = new Company("CTDev", 8000, salaryService);
        company.getEmployees().add(new Employee(150, 5, MANAGER));//10000
        company.getEmployees().add(new Employee(150, 5, DEVELOPER));//20000
        company.getEmployees().add(new Employee(150, 5, SCRUM_MASTER));//10000
        company.getEmployees().add(new Employee(150, 5, DEVELOPER));//500
        company.getEmployees().add(new Employee(150, 5, MANAGER));//10000
        company.getSalaryService().pay(company);
    }
}
