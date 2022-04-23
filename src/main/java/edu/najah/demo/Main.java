package edu.najah.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Stage Window ;


    @Override
    public void start(Stage stage) throws IOException
    {
        Window =stage;
        Parent root = FXMLLoader.load(getClass().getResource("/edu/najah/demo/front.fxml"));
        Window.setTitle("EasyProject");
        Window.setScene(new Scene(root, 569, 400));
        Window.show();

    }

    public static void main(String[] args) {
        launch();
    }
}