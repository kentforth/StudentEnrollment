package com.studentenroll.studentenrollment.controller;

import com.studentenroll.studentenrollment.entity.Student;
import com.studentenroll.studentenrollment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/")
  public ModelAndView getAll() {

    List<Student> list = studentService.findAll();
    return new ModelAndView("viewstudents", "list", list);
  }


}
