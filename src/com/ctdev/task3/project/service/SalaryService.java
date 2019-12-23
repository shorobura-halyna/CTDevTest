package com.ctdev.task3.project.service;

import com.ctdev.task3.project.model.Company;

public interface SalaryService {
    int DEVELOPER_BONUS = 300;
    int DAY_WORK_HOURS = 8;

    void pay(Company company);

}
