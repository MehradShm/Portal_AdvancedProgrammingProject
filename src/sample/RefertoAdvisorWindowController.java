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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo pc
 */
public class RefertoAdvisorWindowController implements Initializable {

 
    @FXML
    private Button send;

    @FXML
    private Button Close;

    @FXML
    void handleCloseButtonAction(ActionEvent event) {
            Stage stage = (Stage) Close.getScene().getWindow();
            stage.close();
    }

    @FXML
    void handleSendButtonAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
