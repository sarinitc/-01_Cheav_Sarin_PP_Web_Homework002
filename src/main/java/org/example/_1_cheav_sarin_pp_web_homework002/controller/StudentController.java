package org.example._1_cheav_sarin_pp_web_homework002.controller;

import lombok.RequiredArgsConstructor;
import org.example._1_cheav_sarin_pp_web_homework002.model.Student;
import org.example._1_cheav_sarin_pp_web_homework002.model.response.ApiResponse;
import org.example._1_cheav_sarin_pp_web_homework002.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{student_Id}")
    public ResponseEntity<ApiResponse<Student>> getStudentById(@PathVariable Integer student_Id) {
        if (studentService.getStudentById(student_Id) != null) {
            ApiResponse response = ApiResponse.builder()
                    .timestamp(LocalDateTime.now())
                    .message("Get Student by ID" + student_Id + "SuccessFully")
                    .payload(studentService.getStudentById(student_Id))
                    .build();

            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        return ResponseEntity.notFound().build();
    }

}
