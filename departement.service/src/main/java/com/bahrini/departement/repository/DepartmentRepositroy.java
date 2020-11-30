package com.bahrini.departement.repository;

import com.bahrini.departement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositroy extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
