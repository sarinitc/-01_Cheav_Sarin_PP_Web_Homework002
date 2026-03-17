package org.example._1_cheav_sarin_pp_web_homework002.service;

import org.example._1_cheav_sarin_pp_web_homework002.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    List<Student> findAllStudents();

    Student getStudentById(Integer studentId);
}
