package org.example._1_cheav_sarin_pp_web_homework002.controller;

import lombok.RequiredArgsConstructor;
import org.example._1_cheav_sarin_pp_web_homework002.model.Instructor;
import org.example._1_cheav_sarin_pp_web_homework002.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorService instructorService;
    @GetMapping
    public List<Instructor> getAllInstructors(){
        return instructorService.getAllInstructor();
    }




}
