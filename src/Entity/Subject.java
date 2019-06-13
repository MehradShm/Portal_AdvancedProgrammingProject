package Entity;

import java.util.ArrayList;

public class Subject {
    
    private String Name;
    private int Units , NumberofPrerequisite;
    ArrayList<Subject> subject = new ArrayList();
    String majorName;

    public String getMajorName() {
        return majorName;
    }

    public Subject(String Name, int Units) {
        this.Name = Name;
        this.Units = Units;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public Subject() {
    }
    
    public int getUnits() {
        return Units;
    }
    public void setUnits(int Units) {
        this.Units = Units;
    }

    public int getNumberofPrerequisite() {
        return NumberofPrerequisite;
    }
    public void setNumberofPrerequisite(int NumberofPrerequisite) {
        this.NumberofPrerequisite = NumberofPrerequisite;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public Subject(String Name, int Units, int NumberofPrerequisite) {
        this.Name = Name;
        this.Units = Units;
        this.NumberofPrerequisite = NumberofPrerequisite;
    }

    public Subject(String Name, int Units, int NumberofPrerequisite, String majorName) {
        this.Name = Name;
        this.Units = Units;
        this.NumberofPrerequisite = NumberofPrerequisite;
        this.majorName = majorName;
    }
    
    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }
    
}
