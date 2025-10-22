package com.School.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.School.students.model.SchoolClass;
import com.School.students.model.Student;
import com.School.students.service.SchoolClassService;
import com.School.students.service.StudentService;


@RestController
@RequestMapping("/api/classes")
@CrossOrigin(origins = "*")
public class SchoolController {
	
    @Autowired
    private SchoolClassService service;

    public void SchoolController(SchoolClassService service) {
        this.service = service;
    }

    @GetMapping
    public List<SchoolClass> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SchoolClass getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public SchoolClass add(@RequestBody SchoolClass schoolClass) {
        return service.save(schoolClass);
    }

    @PutMapping("/{id}")
    public SchoolClass update(@PathVariable Long id, @RequestBody SchoolClass schoolClass) {
    	schoolClass.setId(id);
        return service.save(schoolClass);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
