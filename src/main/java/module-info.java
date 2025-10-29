module com.example.studentmanager {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  requires com.dlsc.formsfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires eu.hansolo.tilesfx;

  opens com.example.studentmanager to javafx.fxml;
  exports com.example.studentmanager;
}