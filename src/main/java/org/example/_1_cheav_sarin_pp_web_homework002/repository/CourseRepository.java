package org.example._1_cheav_sarin_pp_web_homework002.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example._1_cheav_sarin_pp_web_homework002.model.Course;

import java.util.List;

@Mapper
public interface CourseRepository {
    @Select("SELECT * FROM courses")
    List<Course> findAllCourses();
}
