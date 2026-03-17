package org.example._1_cheav_sarin_pp_web_homework002.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example._1_cheav_sarin_pp_web_homework002.model.Student;

import java.util.List;

@Mapper
public interface StudentRepository {
    @Select("SELECT* FROM students")
    List<Student> findAllStudents();
// ---
    @Select("""
            select * from students
            where student_id = #{student_Id}
            
            
            """)
    Student findStudentById(Integer studentId);
}
