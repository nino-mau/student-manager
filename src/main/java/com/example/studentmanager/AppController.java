package com.example.studentmanager;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class AppController {
  @FXML private TableView<Student> TVStudent;
  @FXML private ObservableList<Student> studentData = FXCollections.observableArrayList();

  @FXML
  public void initialize() {
    this.initializeStudentTableView();

  }

  @FXML
  protected void initializeStudentTableView() {
    studentData.add(
        new Student(
            "Nino", "Mauuary", 23, new StudentGrade[] {new StudentGrade(20.0, 1.0, "French")}));
    TVStudent.setItems(studentData);
  }
}
