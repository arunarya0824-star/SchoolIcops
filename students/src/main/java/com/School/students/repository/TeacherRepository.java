package com.School.students.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.School.students.model.Teacher;
public interface TeacherRepository extends JpaRepository<Teacher, Long>  {

}
