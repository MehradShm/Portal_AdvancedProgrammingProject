package Entity;

import java.util.*;
public class AdvanceSubject extends Subject {
    
    private Teacher teacher;
    private Time ClassTime, ExamDate;
    private int Group, Capacity;
    private Department department;
    ArrayList <Student> students = new ArrayList();
    
    public AdvanceSubject(Teacher teacher, Time ClassTime, Time ExamDate, int Group, int Capacity, Department department, String Name, int Units, int NumberofPrerequisite) {
        super(Name, Units, NumberofPrerequisite);
        this.teacher = teacher;
        this.ClassTime = ClassTime;
        this.ExamDate = ExamDate;
        this.Group = Group;
        this.Capacity = Capacity;
        this.department = department;
    }

    public AdvanceSubject(Teacher teacher, int Group, int Capacity, Department department, String Name, int Units) {
        super(Name, Units);
        this.teacher = teacher;
        this.Group = Group;
        this.Capacity = Capacity;
        this.department = department;
    }

    public AdvanceSubject() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Time getClassTime() {
        return ClassTime;
    }

    public void setClassTime(Time ClassTime) {
        this.ClassTime = ClassTime;
    }

    public Time getExamDate() {
        return ExamDate;
    }

    public void setExamDate(Time ExamDate) {
        this.ExamDate = ExamDate;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public void setStudents(ArrayList <Student> students){
        students = students;
    }
}
