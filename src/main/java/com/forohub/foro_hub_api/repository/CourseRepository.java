package com.forohub.foro_hub_api.repository;

import com.forohub.foro_hub_api.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
