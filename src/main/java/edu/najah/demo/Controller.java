package edu.najah.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public static Stage Window1;



    //Button to Admin Profile
    public Button EditAdmin;
    public Button ChangeImageAdmin;


    //TextField to Admin Profile
    public TextField NameAdmin;
    public TextField AddressAdmin;
    public TextField IDAdmin;
    public TextField PasswordAdmin;
    public TextField GenderAdmin;
    public TextField EmailAdmin;

    //TextField to Add Employee
    public TextField EmailInsert;
    public TextField NameInsert;
    public TextField AddressInsert;
    public TextField IDInsert;
    public TextField PasswordInsert;
    public TextField GenderInsert;

    //Button to Add Employee
    public Button SaveInsert;
    public Button ChangeInsert;

    //Label of Admin in Insert
    public Label Label_Name_Admin_Insert;


    @FXML
    public void LoginAdmin(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1 = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/edu/najah/demo/LoginA.fxml"));
        primaryStage.setTitle("Login Admin");
        primaryStage.setScene(new Scene(root, 310, 413));
        primaryStage.show();
        Main.Window.close();
    }

    @FXML
    public void LoginEmployee(MouseEvent mouseEvent ) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1 = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/edu/najah/demo/LoginE.fxml"));
        primaryStage.setTitle("Login Employee");
        primaryStage.setScene(new Scene(root, 310, 406));
        primaryStage.show();
        Main.Window.close();
    }

    @FXML
    public void Logout (MouseEvent mouseEvent ) throws IOException
    {
        Window1.close();
        Main.Window.show();
    }


    @FXML
    public void ProfileAdmin(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1.close();
        Window1 = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/najah/demo/ProfileA.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Profile Admin");
        primaryStage.setScene(new Scene(root, 987, 616));
        primaryStage.show();
    }


    @FXML
    public void ProfileEmployee(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1.close();
        Window1 = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/najah/demo/ProfileE.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Profile Employee");
        primaryStage.setScene(new Scene(root, 987, 616));
        primaryStage.show();
    }

    @FXML
    public void EditProfile(MouseEvent mouseEvent) throws IOException
    {
        if(EditAdmin.getText().equals("Edit Info"))
        {
            NameAdmin.setDisable(false);
            AddressAdmin.setDisable(false);
            IDAdmin.setDisable(false);
            PasswordAdmin.setDisable(false);
            GenderAdmin.setDisable(false);
            EmailAdmin.setDisable(false);
            EditAdmin.setText("Save Info");
        }
        else if (EditAdmin.getText().equals("Save Info"))
        {
            NameAdmin.setDisable(true);
            AddressAdmin.setDisable(true);
            IDAdmin.setDisable(true);
            PasswordAdmin.setDisable(true);
            GenderAdmin.setDisable(true);
            EmailAdmin.setDisable(true);
            EditAdmin.setText("Edit Info");
        }
        else
        {
            System.out.println("Error");
        }
    }

    @FXML
    public void InsertEmployee(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1.close();
        Window1 = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/najah/demo/AddE.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Profile Employee");
        primaryStage.setScene(new Scene(root, 987, 616));
        primaryStage.show();

    }

    @FXML
    public void Save_Employee(MouseEvent mouseEvent) throws IOException
    {


    }

}