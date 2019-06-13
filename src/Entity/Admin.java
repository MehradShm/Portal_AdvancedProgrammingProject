package Entity;

import java.util.*;
import db.Database;


public class Admin {
    
    private String User , Password;
    Database database;
    public static final String username = "admin";
    public static final String password = "admin";

    public Admin(String User, String Password, Database database) {
        this.User = User;
        this.Password = Password;
        this.database = database;
    }
    
    // public void addTeacher()
    
    //public void removeTeacher()
    
    //public void addStudent()
    
    //public void removeStudent()

    
    
    
}
