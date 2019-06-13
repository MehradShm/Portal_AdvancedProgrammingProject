package sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo pc
 */
public class AddPersonWindowController implements Initializable {

    
    @FXML
    private TextField TeacherName;

    @FXML
    private TextField TeacherFamily;

    @FXML
    private TextField TeacherID;

    @FXML
    private TextField TeacherDepartmentname;

    @FXML
    private Button AddStudent;

    @FXML
    private TextField StudentName;

    @FXML
    private TextField StudentFamily;

    @FXML
    private TextField StudentID;

    @FXML
    private TextField StudentAdvisorID;

    @FXML
    private TextField StudentDepartmentname;

    @FXML
    private TextField StudentMajorname;

    @FXML
    private Button AddTeacher;

    @FXML
    private Button close;

    @FXML
    void handleAddStudentButtonAction(ActionEvent event) {

    }

    @FXML
    void handleAddTeacherButtonAction(ActionEvent event) {

    }

    @FXML
    void handleCloseButtonAction(ActionEvent event) {
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
