package com.mohadese.esm.service;

import com.mohadese.esm.dto.APIResponseDto;
import com.mohadese.esm.dto.EmployeeDto;


public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
