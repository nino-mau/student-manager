package com.example.studentmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("app-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 1400, 900);
    stage.setTitle("Student Manager");
    stage.setScene(scene);
    stage.show();
  }
}

