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
public class SetScoreWindowController implements Initializable {

    
    @FXML
    private TextArea setScoreTextArea;

    @FXML
    private TextField leftTextFiled;

    @FXML
    private TextField middleTextField;

    @FXML
    private TextField rightTextField;

    @FXML
    private Button setButton;

    @FXML
    private Button finalize;

    @FXML
    private Button close;

    @FXML
    void handleCloseButtonActon(ActionEvent event) {
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
    }

    @FXML
    void handleFinalizeButtonAction(ActionEvent event) {

    }

    @FXML
    void handleSetButtonAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
