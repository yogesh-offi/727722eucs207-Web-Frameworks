package com.project1.day7queryusingjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day7queryusingjpa.Model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {

    @Query("select C from Course C where courseName = :cn")
    List<Course> getByCN(String cn);

}
