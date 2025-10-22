package com.School.students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.School.students.model.SchoolClass;
import com.School.students.model.Student;
import com.School.students.repository.SchoolClassRepository;
import com.School.students.repository.StudentRepository;


@Service
public class SchoolClassService {
	

    private final SchoolClassRepository repo;

    public SchoolClassService(SchoolClassRepository repo) {
        this.repo = repo;
    }

    public List<SchoolClass> getAll() { return repo.findAll() ;}
    public SchoolClass getById(Long id) { return repo.findById(id).orElse(null); }
    public SchoolClass save(SchoolClass schoolClass) { return repo.save(schoolClass); }
    public void delete(Long id) { repo.deleteById(id); }


}
