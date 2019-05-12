package com.studentenroll.studentenrollment.service;

import com.studentenroll.studentenrollment.entity.Student;
import com.studentenroll.studentenrollment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  //save student
  public Student save(Student student) {
    return studentRepository.save(student);
  }

  //  fetch all students
  public List<Student> findAll() {
    return studentRepository.findAll();
  }

  //  get a student by id
  public Student findOne(Integer id) {
    return studentRepository.findById(id).orElse(null);
  }

  //  delete student
  public void delete(Student student) {
     studentRepository.delete(student);
  }

  public void deleteAll() {
    studentRepository.deleteAll();
  }

}
