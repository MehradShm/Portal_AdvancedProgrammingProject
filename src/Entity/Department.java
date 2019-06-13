package Entity;

import java.util.*;
public class Department {
    
    private String name;

    public Department() {
    }
    private Admin admin;
    
    ArrayList <Major> majors = new ArrayList();
    ArrayList <Teacher> teachers = new ArrayList();
    ArrayList <AdvanceSubject> AS = new ArrayList();
    ArrayList <Student> students = new ArrayList();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    public Department(String name, Admin admin) {
        this.name = name;
        this.admin = admin;
    }
    
    public Department(String name) {
        this.name = name;
    }
    
    
}
