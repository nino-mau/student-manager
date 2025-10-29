package com.example.studentmanager;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

import java.io.IOException;

public class AppController {
  @FXML private FlowPane studentCardGrid;
  @FXML private HBox studentCardList;
  @FXML private TableView<Student> TVStudent;
  @FXML private ObservableList<Student> studentData = FXCollections.observableArrayList();

  @FXML
  public void initialize() {
    for (int i = 0; i < 10; i++) {
      try {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("studentcard-view.fxml"));
        Region studentCard = fxmlLoader.load();

        studentCardGrid.getChildren().add(studentCard);
      } catch (IOException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }
  }

  @FXML
  protected void initializeStudentTableView() {
    studentData.add(
        new Student(
            "Nino", "Mauuary", 23, new StudentGrade[] {new StudentGrade(20.0, 1.0, "French")}));
    TVStudent.setItems(studentData);
  }
}
