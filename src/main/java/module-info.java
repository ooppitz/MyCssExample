module com.example.mycssexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycssexample to javafx.fxml;
    exports com.example.mycssexample;
}