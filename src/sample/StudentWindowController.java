package sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author lenovo pc
 */
public class StudentWindowController implements Initializable {

     @FXML
    private Button information;

    @FXML
    private Button result;

    @FXML
    private Button pickSubject;

    @FXML
    private Button emergencyRemove;

    @FXML
    private Button refertoAdvisor;

    @FXML
    private Button evalution;

    @FXML
    private Button close;

    @FXML
    void handleCloseButtonAction(ActionEvent event) {
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
    }

    @FXML
    void handleEmergencyRemoveButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Emergencyremovewindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleEvaluationButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Evaluatewindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleInformationButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Informationstudentwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handlePickSubjectButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("PickSubjectwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleRefertoAdvisorButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("RefertoAdvisorwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleResultButtonAction(ActionEvent event) {
        
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Resultwindows.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
