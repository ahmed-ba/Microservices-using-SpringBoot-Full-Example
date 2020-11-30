package com.bahrini.departement.service;

import com.bahrini.departement.model.Department;
import com.bahrini.departement.repository.DepartmentRepositroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepositroy departmentRepositroy;

    public Department saveDepartment(Department department) {
      log.info("inside saveDepartment of DepartmentService ");
        return  departmentRepositroy.save(department);
    }


    public Department findDepartmentById(Long departmentId) {
        log.info("inside saveDepartment of DepartmentService ");
        return departmentRepositroy.findByDepartmentId(departmentId);
    }
}
