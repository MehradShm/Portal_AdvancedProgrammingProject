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
public class SubmitSubjectWindowController implements Initializable {


    @FXML
    private TextField subjectname;

    @FXML
    private TextField day;

    @FXML
    private TextField hourL;

    @FXML
    private TextField hourR;

    @FXML
    private TextField minL;

    @FXML
    private TextField minR;

    @FXML
    private TextField departmentname;

    @FXML
    private TextField capacity;

    @FXML
    private Button sendRequestButton;

    @FXML
    private Button close;

    @FXML
    void handleCloseButtonActon(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleSendRequestButton(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
