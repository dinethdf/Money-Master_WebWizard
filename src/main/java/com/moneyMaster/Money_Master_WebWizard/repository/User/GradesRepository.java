package com.moneyMaster.Money_Master_WebWizard.repository.User;


import com.moneyMaster.Money_Master_WebWizard.model.User.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradesRepository extends JpaRepository<Grades, Long> {
    // No need to add methods here; JpaRepository provides CRUD methods by default
    List<Grades> findByStudentId(Long studentId);
}