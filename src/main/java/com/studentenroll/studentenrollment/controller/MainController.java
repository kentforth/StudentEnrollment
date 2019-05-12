package com.studentenroll.studentenrollment.controller;

import com.studentenroll.studentenrollment.entity.Student;
import com.studentenroll.studentenrollment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
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


  @GetMapping("/enroll")
  public String registerStudent(ModelMap model) {
    Student student = new Student();
    model.addAttribute("student", student);
    return "enroll";
  }

  @PostMapping("/save")
  public String saveStudent(@Valid Student student,
                            BindingResult result,
                            ModelMap model,
                            RedirectAttributes redirectAttributes) {
    if (result.hasErrors()) {
      System.out.println("has errors");
      return "enroll";
    }
      studentService.save(student);
      return "redirect:/";


  }

//  populate combobox with countries
  @ModelAttribute("countries")
  public List<String> initializeCountries() {

    List<String> countries = new ArrayList<>();
    countries.add("CANADA");
    countries.add("RUSSIA");
    countries.add("BRAZIL");
    countries.add("USA");
    countries.add("ITALIA");
    countries.add("BELGIUM");
    countries.add("FRANCE");
    countries.add("GERMANY");
    countries.add("OTHER");
    return countries;
  }

//  populate combobox with sections
  @ModelAttribute("sections")
  public List<String> initializeSections() {
    List<String> sections = new ArrayList<>();
    sections.add("Graduate");
    sections.add("Post Graduate");
    sections.add("Research");
    return sections;
  }


}
