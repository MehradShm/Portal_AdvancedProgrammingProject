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
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author lenovo pc
 */
public class AdminWindowController implements Initializable {

    
    @FXML
    private Button CreateDepartment;

    @FXML
    private Button subjectRequest;

    @FXML
    private Button Remove;

    @FXML
    private Button Add;

    @FXML
    private Button CloseAdmin;

    @FXML
    void handleAddButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("AddPersonwindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleCloseAdminButtonAction(ActionEvent event) {
            Stage stage = (Stage) CloseAdmin.getScene().getWindow();
            stage.close();
    }

    @FXML
    void handleCreateDepartmentButtonAction(ActionEvent event) {
        
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("CreateDepartmentWindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
        
        
    }

    @FXML
    void handleRemoveButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("RemovePersonWindow.fxml"));
                Parent root1 = (Parent) fx.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                
            
            } catch(IOException ex){System.out.println("Can't load new window.");}
    }

    @FXML
    void handleSubjectRequestButtonAction(ActionEvent event) {
        try { 
                FXMLLoader fx = new FXMLLoader(getClass().getResource("SubjectRequestWindow.fxml"));
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
