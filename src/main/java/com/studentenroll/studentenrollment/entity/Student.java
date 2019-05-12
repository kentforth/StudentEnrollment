package com.studentenroll.studentenrollment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Size(min = 3, max = 30)
  private String firstName;

  @Size(min = 3, max = 30)
  private String lastName;

  @NotBlank
  private String email;

  @NotBlank
  private String country;

  @NotBlank
  private String gender;

  @NotBlank
  private String section;



}
