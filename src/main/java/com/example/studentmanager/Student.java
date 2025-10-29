package com.example.studentmanager;

public class Student {
  private String firstname;
  private String lastname;
  private int age;
  private StudentGrade[] grades;

  public Student(String firstname, String lastname, int age, StudentGrade[] grades) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.grades = grades;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public StudentGrade[] getGrades() {
    return grades;
  }

  public void setGrades(StudentGrade[] grades) {
    this.grades = grades;
  }
}
