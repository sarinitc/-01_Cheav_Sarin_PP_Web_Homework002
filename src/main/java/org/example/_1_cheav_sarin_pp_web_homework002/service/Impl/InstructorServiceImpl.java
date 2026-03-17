package org.example._1_cheav_sarin_pp_web_homework002.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example._1_cheav_sarin_pp_web_homework002.model.Instructor;
import org.example._1_cheav_sarin_pp_web_homework002.repository.InstructorRepository;
import org.example._1_cheav_sarin_pp_web_homework002.service.InstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;
    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAllInstructor();
    }

    @Override
    public List<Instructor> findAllInstructor() {
        return List.of();
    }
}
