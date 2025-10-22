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

import com.School.students.model.Student;
import com.School.students.model.Teacher;
import com.School.students.service.StudentService;
import com.School.students.service.TeacherService;


@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "*")
public class TeacherController {

	
	 @Autowired
    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping
    public List<Teacher> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Teacher getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Teacher add(@RequestBody Teacher teacher) {
        return service.save(teacher);
    }

    @PutMapping("/{id}")
    public Teacher update(@PathVariable Long id, @RequestBody Teacher teacher) {
    	teacher.setId(id);
        return service.save(teacher);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
