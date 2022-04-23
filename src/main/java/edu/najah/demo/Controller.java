package edu.najah.demo;

import com.jfoenix.controls.JFXRadioButton;
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
    public static Stage Window2;



    //////Admin//////


    //Button to Admin Profile
    public Button EditAdmin;
    public Button ChangeImageAdmin;

    ///Label
    public Label Label_Name_Admin;
    public Label LabelSave_A;


    //TextField to Admin Profile
    public TextField NameAdmin;
    public TextField AddressAdmin;
    public TextField IDAdmin;
    public TextField PasswordAdmin;
    public TextField GenderAdmin;
    public TextField EmailAdmin;


    ///////Add Employee//////
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

    //Label of Admin in Insert Employee & Admin
    public Label Label_Name_Admin_Insert;


    /////// Employee//////
    //Label of Employee
    public Label Label_Name_Employee;
    public Label LabelSave_E;

    //TextField to Add Employee
    public TextField EmailEmployee;
    public TextField NameEmployee;
    public TextField AddressEmployee;
    public TextField IDEmployee;
    public TextField PasswordEmployee;
    public TextField GenderEmployee;


    //Button to Employee Profile
    public Button ChangeImageEmployee;
    public Button EditEmployee;

    ///Radio
    public JFXRadioButton RadioInsertAdmin;
    public JFXRadioButton RadioInsertEmployee;

    ///////Delete User//////
    ///Label
    public Label Label_Name_Admin_Delete;


    //Text
    public TextField EmailDelete;
    public TextField NameDelete;
    public TextField AddressDelete;
    public TextField IDDelete;
    public TextField PasswordDelete;
    public TextField GenderDelete;

    //Button
    public Button DeleteUser;

    //Radio
    public JFXRadioButton RadioAdmin;
    public JFXRadioButton RadioEmployee;



//    ComboBox combo_box =
//            new ComboBox(FXCollections
//                    .observableArrayList(week_days));


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
        Window2.close();
        Main.Window.show();
    }

    public void Previous_toProfile(MouseEvent mouseEvent ) throws IOException
    {
        Window2.close();
        Window1.show();
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
    public void EditProfile_Admin(MouseEvent mouseEvent) throws IOException
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
            LabelSave_A.setText("You can Save your personal information by pressing the button");
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
            LabelSave_A.setText("You can change your personal information by pressing the button");
        }
        else
        {
            System.out.println("Error");
        }
    }

    public void EditProfile_Employee(MouseEvent mouseEvent) throws IOException
    {
        if(EditEmployee.getText().equals("Edit Info"))
        {
            NameEmployee.setDisable(false);
            AddressEmployee.setDisable(false);
            IDEmployee.setDisable(false);
            PasswordEmployee.setDisable(false);
            GenderEmployee.setDisable(false);
            EmailEmployee.setDisable(false);
            EditEmployee.setText("Save Info");
            LabelSave_E.setText("You can Save your personal information by pressing the button");
        }
        else if (EditEmployee.getText().equals("Save Info"))
        {
            NameEmployee.setDisable(true);
            AddressEmployee.setDisable(true);
            IDEmployee.setDisable(true);
            PasswordEmployee.setDisable(true);
            GenderEmployee.setDisable(true);
            EmailEmployee.setDisable(true);
            EditEmployee.setText("Edit Info");
            LabelSave_E.setText("You can change your personal information by pressing the button");
        }
        else
        {
            System.out.println("Error");
        }
    }

    @FXML
    public void InsertEmployee_Profile(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1.close();
        Window2 = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/najah/demo/AddE.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Insert User");
        primaryStage.setScene(new Scene(root, 987, 616));
        primaryStage.show();

    }

    @FXML
    public void Save_Employee(MouseEvent mouseEvent) throws IOException
    {


    }

    public void Search(MouseEvent mouseEvent) throws IOException
    {
        Stage primaryStage = new Stage();
        Window1.close();
        Window2 = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/edu/najah/demo/Search.fxml"));
        Window2.setTitle("Search");
        Window2.setScene(new Scene(root, 1102, 410));
        Window2.show();

    }


}