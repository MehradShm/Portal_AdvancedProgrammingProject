package sample;

import Entity.Department;
import Entity.Student;
import Entity.Teacher;
import db.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;

public class FXMLDocumentController {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button loginButton1;

    @FXML
    private Button forgetPassword;

    @FXML
    private Label forgetlabel;

    @FXML
    private Button close;

    @FXML
    void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleForgetPasswordButtonAction(ActionEvent event) {
        forgetlabel.setText("Check your email.");
    }

    @FXML
    void handleLoginButtonAction(ActionEvent event) {
        ArrayList<Department> department = new ArrayList();
        Database d = new Database(department);
        d.getDepartmentNumLine();
        d.readDepartment();


        ArrayList<Student> student = new ArrayList();
        ArrayList<Teacher> teacher = new ArrayList();
        Database tsa = new Database(teacher, student);
        tsa.getTeacherNumLine();
        tsa.getStudentNumLine();
        tsa.readTeacher();
        tsa.readStudent();




        for (int i = 0; i < tsa.getStudentNumLine(); i++) {
            System.out.println(student.get(i).getSID());
        }




        /*
        ArrayList student = new ArrayList();
        ArrayList teacher = new ArrayList();
        Database tsa = new Database(teacher, student);
        tsa.getTeacherNumLine();
        tsa.getStudentNumLine();
        tsa.readTeacher();
        tsa.readStudent();
        */




        // Admin
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("AdminWindow.fxml"));
            Parent root1 = (Parent) fx.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();


        } catch(IOException ex){System.out.println("Can't load new window.");}



        // Student
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("StudentWindow.fxml"));
            Parent root1 = (Parent) fx.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();


        } catch(IOException ex){System.out.println("Can't load new window.");}


        // Teacher
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("TeacherWindow.fxml"));
            Parent root1 = (Parent) fx.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();


        } catch(IOException ex){System.out.println("Can't load new window.");}

    }



}
