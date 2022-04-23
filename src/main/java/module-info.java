module edu.najah.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens edu.najah.demo to javafx.fxml;
    exports edu.najah.demo;
}