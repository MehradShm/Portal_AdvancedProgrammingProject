package Entity;

import java.util.*;
public class Teacher extends Human{
    
    private String ID, Speciality, departmentName;
    private double income;
    private int PresentUnit;
    private static Admin admin;
    Major major;

    Student students;
    ArrayList <AdvanceSubject> Subjects;

    public Teacher(String ID, String Speciality, String departmentName, double income, int PresentUnit, Major major, String Name, String Family, String Father, String nationalid, String Birthday, String Gender) {
        super(Name, Family, Father, nationalid, Birthday, Gender);
        this.ID = ID;
        this.Speciality = Speciality;
        this.departmentName = departmentName;
        this.income = income;
        this.PresentUnit = PresentUnit;
        this.major = major;
    }
    
    public Teacher(String ID, String Speciality, String departmentName, double income, int PresentUnit, Major major, Student students, String Name, String Family, String Father, String nationalid, String Birthday, String Gender) {
        super(Name, Family, Father, nationalid, Birthday, Gender);
        this.ID = ID;
        this.Speciality = Speciality;
        this.departmentName = departmentName;
        this.income = income;
        this.PresentUnit = PresentUnit;
        this.major = major;
        this.students = students;
    }
    

    public Teacher() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getPresentUnit() {
        return PresentUnit;
    }

    public void setPresentUnit(int PresentUnit) {
        this.PresentUnit = PresentUnit;
    }

    public static Admin getAdmin() {
        return admin;
    }

    public static void setAdmin(Admin admin) {
        Teacher.admin = admin;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }
    
    
    /*
    public void refertoadvisor(){
        Scanner console = new Scanner (System.in);
        //System.out.println("The Students who requested for checking their status are:");
        for (int i = 0; i < Students.size(); i++) {
            // Edit
           if ( Students.get(i).isAdivsorRequest()){
               System.out.println((i+1)+"-"+Students.get(i).getName());
           }
        }
        //System.out.println("Select one of the above to set his/her activestatus");
        Students.get(console.nextInt()).setActiveStatus(true);
    }
*/
}
