package Entity;

import java.util.*;
public class Major {
    
    private String name;
    private Department d;
    private Admin admin;

    public Major() {
    }
    
    ArrayList <Subject> subjects = new ArrayList();
    ArrayList <Teacher> teachers = new ArrayList();
    ArrayList <Student> students = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getD() {
        return d;
    }

    public void setD(Department d) {
        this.d = d;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Major(String name) {
        this.name = name;
    }

    public Major(String name, Department d) {
        this.name = name;
        this.d = d;
    }
    
    public void addSubjects(Subject a){
        subjects.add(a);
    }
    
    public void addTeacher(Teacher t){
        teachers.add(t);
        d.teachers.add(t);
    }
    
    public void fireTeacher(Teacher t){
        teachers.remove(t);
        d.teachers.remove(t);
    }
    
    public void addStudent(Student s){
        students.add(s);
        d.students.add(s);
    }
    
    public void BanStudent(Student s){
        students.remove(s);
        d.students.remove(s);
    }
}
