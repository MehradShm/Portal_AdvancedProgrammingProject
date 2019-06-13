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
public class InformationTeacherWindowController implements Initializable {

    
    @FXML
    private TextField Teachername;

    @FXML
    private TextField Teachermajor;

    @FXML
    private TextField Studentbirth;

    @FXML
    private TextField Teacherbirth;

    @FXML
    private TextField Teacherfather;

    @FXML
    private TextField Teachergender;

    @FXML
    private TextField Teacherfamily;

    @FXML
    private Button close;

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
