package com.employee_project.repository;

import org.springframework.stereotype.Component;

@Component
public class OvertimeHours implements HoursRepository{
    @Override
    public int getHours() {
        return 15;
    }
}
