package com.company.adapter;

import com.company.adapter.repo.AdminStudentAdapter;
import com.company.entities.Student;
import com.company.factory.StudentFactory;

import java.util.Map;

public class AdminStudent implements AdminStudentAdapter {
    private final Student student;

    public AdminStudent(Student student) {
        this.student = student;
    }

    @Override
    public void deleteStudent(Student student) {
        StudentFactory.getInstance().getStudents().remove(student.getUsername());
    }

    @Override
    public Student getStudent(String username) {
        return StudentFactory.getInstance().getStudents().get(username);
    }

    @Override
    public Map<String, Student> getAllStudents() {
        return StudentFactory.getInstance().getStudents();
    }
}
