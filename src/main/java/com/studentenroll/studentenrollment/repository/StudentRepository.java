package com.studentenroll.studentenrollment.repository;

import com.studentenroll.studentenrollment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



}
