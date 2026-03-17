package org.example._1_cheav_sarin_pp_web_homework002.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example._1_cheav_sarin_pp_web_homework002.model.Instructor;

import java.util.List;

@Mapper
public interface InstructorRepository {
    @Select("SELECT * FROM instructors")

    List<Instructor> findAllInstructor();
}
