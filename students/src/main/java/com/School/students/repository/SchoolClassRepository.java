package com.School.students.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.School.students.model.SchoolClass;
public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {

}
