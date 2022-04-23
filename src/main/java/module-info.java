module edu.najah.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.najah.demo to javafx.fxml;
    exports edu.najah.demo;
}