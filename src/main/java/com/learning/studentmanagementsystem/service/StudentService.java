package com.learning.studentmanagementsystem.service;

import com.learning.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long id);
    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
