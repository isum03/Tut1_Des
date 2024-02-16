package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class HelloController {
    @FXML
    private TextField FirstNameTextField;
    @FXML
    private TextField  lastnametextfield;
    @FXML
    private TextField  agetext;
    @FXML
    private DatePicker  birthdaypicker;
    @FXML
    private ComboBox<String>genderComboBox;
    @FXML
    public void initialize(){
        genderComboBox.getItems().addAll("Male","Female","Other");
    }
   /* @FXML
    private TextField  agetext;
    @FXML
    private TextField  agetext;
    */

}





        Scene scene = new Scene(grid, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Personal Details and Login Form");
        primaryStage.show();
    }

    public static void main(String[] args) {launch();}
}
