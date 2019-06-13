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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo pc
 */
public class ResultWindowsController implements Initializable {

    @FXML
    private TextField PassedUnits;

    @FXML
    private TextField FailedUnits;

    @FXML
    private TextField TermUnits;

    @FXML
    private TextField TakenUnits;

    @FXML
    private TextField WithdrawnUnits;

    @FXML
    private TextField EmergencyRemove;

    @FXML
    private TextField Average;

    @FXML
    private Button close;
    
    @FXML
    private TextArea ResulttextArea;

    @FXML
    void handleCloseButtonActon(ActionEvent event) {
        
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
