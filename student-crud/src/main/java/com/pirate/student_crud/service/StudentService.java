package com.pirate.student_crud.service;

import com.pirate.student_crud.model.Student;
import com.pirate.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // GET ALL students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // GET student by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // CREATE new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // UPDATE student
    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    // DELETE student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}