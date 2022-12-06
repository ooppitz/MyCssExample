package com.example.mycssexample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    public class MyData {
        String contents1;
        String contents2;

        public MyData(String contents1, String contents2) {
            this.contents1 = contents1;
            this.contents2 = contents2;
        }

        public String getContents1() {
            return contents1;
        }

        public void setContents1(String contents1) {
            this.contents1 = contents1;
        }

        public String getContents2() {
            return contents2;
        }

        public void setContents2(String contents2) {
            this.contents2 = contents2;
        }
    }

    @FXML
    private TableColumn<MyData, String> tcColumn1;

    @FXML
    private TableColumn<MyData, String> tcColumn2;

    @FXML
    private TableView<MyData> tvTable;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void initialize() {

        tvTable.getItems().addAll(new MyData("John", "McEnroe"),
                new MyData("Boris Franz", "Becker"),
                new MyData("Karsten", "Braasch"),
                new MyData("Serena", "Williamns"),
                new MyData("Venus", "Williams"));

        tcColumn1.setCellValueFactory(new PropertyValueFactory<MyData, String>("contents1"));
        tcColumn2.setCellValueFactory(new PropertyValueFactory<MyData, String>("contents2"));

    }
}