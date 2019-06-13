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
public class TeacherWindowController implements Initializable {


    @FXML
    private Button informationButton;

    @FXML
    private Button setscoreButton;

    @FXML
    private Button submitSubjectButton;

    @FXML
    private Button referAdvisorButton;

    @FXML
    private Button emergencyRemove;

    @FXML
    private Button close;

    @FXML
    void handleCloseButtonActon(ActionEvent event) {
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
    }

    @FXML
    void handleEmergencyRemoveButtonActon(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Emergencyteacherremoverequestwindow.fxml"));
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
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Informationteacherwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleReferAdvisorButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Refertoadvisorrequestwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleSetScoreButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Setscorewindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleSubmitSubjectButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("Submitsubjectwindow.fxml"));
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
