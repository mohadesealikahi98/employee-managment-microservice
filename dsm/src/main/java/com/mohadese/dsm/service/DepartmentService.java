package com.mohadese.dsm.service;

import com.mohadese.dsm.dto.DepartmentDto;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
