package com.ctdev.task3.project.service.impl;

import com.ctdev.task3.project.model.Company;
import com.ctdev.task3.project.model.Employee;
import com.ctdev.task3.project.service.SalaryService;

public class BasicSalaryService implements SalaryService {

    @Override
    public void pay(Company company) {
        if (isBudgetEmpty(company)) {
            System.out.println("Company " + company.getName() + " doesn't have money.");
        } else {
            int countPayedSalaries = 0;
            for (Employee employee : company.getEmployees()) {
                double salary = calculateSalary(employee);
                if (company.getBudget() >= salary) {
                    payment(company, employee, salary);
                    countPayedSalaries++;
                } else {
                    System.out.println("Company " + company.getName() + " doesn't have money to pay " + salary + " for employee with position "
                            + employee.getPosition().name() + ". Company balance = " + company.getBudget());
                }
            }
            printSummary(company, countPayedSalaries);
        }
    }

    private void payment(Company company, Employee employee, double salary) {
        company.setBudget(company.getBudget() - salary);
        employee.setSalary(salary);
    }

    private boolean isBudgetEmpty(Company company) {
        return company.getBudget() <= 0;
    }

    private double calculateSalary(Employee employee) {
        double salary;
        switch (employee.getPosition()) {
            case SCRUM_MASTER:
            case MANAGER: {
                salary = employee.getRatePerHour() * employee.getWorkdays() * DAY_WORK_HOURS;
                break;
            }
            case DEVELOPER: {
                salary = employee.getRatePerHour() * employee.getWorkdays() * DAY_WORK_HOURS + DEVELOPER_BONUS;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown type of employee!");
            }
        }
        return salary;
    }

    private void printSummary(Company company, int countPayedSalaries) {
        if (countPayedSalaries == company.getEmployees().size()) {
            System.out.println("Company pay salaries for all employees.");
        } else {
            int numberOfNotPayedSalaries = company.getEmployees().size() - countPayedSalaries;
            System.out.println("Company payed salaries to " + countPayedSalaries + " employees.");
            System.out.println("NOT enough money to pay salary for " + numberOfNotPayedSalaries + " employees.");
        }
        System.out.println("Current company balance = " + company.getBudget());
    }
}
