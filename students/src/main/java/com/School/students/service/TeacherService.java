package com.School.students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.School.students.model.Student;
import com.School.students.model.Teacher;
import com.School.students.repository.StudentRepository;
import com.School.students.repository.TeacherRepository;

@Service
public class TeacherService {

    private final TeacherRepository repo;

    public TeacherService(TeacherRepository repo) {
        this.repo = repo;
    }

    public List<Teacher> getAll() { return repo.findAll() ;}
    public Teacher getById(Long id) { return repo.findById(id).orElse(null); }
    public Teacher save(Teacher teacher) { 
    	return repo.save(teacher); }
    public void delete(Long id) { repo.deleteById(id); }


}
