package Entity;

import java.util.*;


public class Student extends Human{
    
    private String SID;
    private Major major;
    private boolean ActiveStatus, FinancalStatus;
    private double Average;
    private int TakenUnits, PassedUnits, FailedUnits, WithdrawnUnits, EmergencyRemove, TermUnits;
    private Teacher teacher;
    private Department department;
    private boolean AdvisorRequest;
    String Message;

    public String getSID() {
        return SID;
    }
    public void setSID(String SID) {
        this.SID = SID;
    }
    public Major getMajor() {
        return major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    public boolean isActiveStatus() {
        return ActiveStatus;
    }
    public void setActiveStatus(boolean ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }
    public boolean isFinancalStatus() {
        return FinancalStatus;
    }
    public void setFinancalStatus(boolean FinancalStatus) {
        this.FinancalStatus = FinancalStatus;
    }
    public double getAverage() {
        return Average;
    }
    public void setAverage(double Average) {
        this.Average = Average;
    }
    public int getTakenUnits() {
        return TakenUnits;
    }
    public void setTakenUnits(int TakenUnits) {
        this.TakenUnits = TakenUnits;
    }
    public int getPassedUnits() {
        return PassedUnits;
    }
    public void setPassedUnits(int PassedUnits) {
        this.PassedUnits = PassedUnits;
    }
    public int getFailedUnits() {
        return FailedUnits;
    }
    public void setFailedUnits(int FailedUnits) {
        this.FailedUnits = FailedUnits;
    }
    public int getWithdrawnUnits() {
        return WithdrawnUnits;
    }
    public void setWithdrawnUnits(int WithdrawnUnits) {
        this.WithdrawnUnits = WithdrawnUnits;
    }
    public int getEmergencyRemove() {
        return EmergencyRemove;
    }
    public void setEmergencyRemove(int EmergencyRemove) {
        this.EmergencyRemove = EmergencyRemove;
    }
    public int getTermUnits() {
        return TermUnits;
    }
    public void setTermUnits(int TermUnits) {
        this.TermUnits = TermUnits;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public boolean isAdvisorRequest() {
        return AdvisorRequest;
    }
    public void setAdvisorRequest(boolean AdvisorRequest) {
        this.AdvisorRequest = AdvisorRequest;
    }
    public String getMessage() {
        return Message;
    }
    public void setMessage(String Message) {
        this.Message = Message;
    }

    ArrayList <Subject> passed = new ArrayList();
    ArrayList <AdvanceSubject> taken = new ArrayList();
    double[] termmarks = new double[10];
    double[] allmarks = new double[100];
    boolean[] finalized = new boolean[100];
    boolean[] didevaluate = new boolean[100];
    Scanner sc = new Scanner(System.in);
    
    public Student(String SID, Major major, boolean ActiveStatus, boolean FinancalStatus, double Average, int TakenUnits, int PassedUnits, int FailedUnits, int WithdrawnUnits, int EmergencyRemove, int TermUnits, Teacher teacher, Department department, boolean AdvisorRequest, String Message, String Name, String Family, String Father, String nationalid, String Birthday, String Gender) {
        super(Name, Family, Father, nationalid, Birthday, Gender);
        this.SID = SID;
        this.major = major;
        this.ActiveStatus = ActiveStatus;
        this.FinancalStatus = FinancalStatus;
        this.Average = Average;
        this.TakenUnits = TakenUnits;
        this.PassedUnits = PassedUnits;
        this.FailedUnits = FailedUnits;
        this.WithdrawnUnits = WithdrawnUnits;
        this.EmergencyRemove = EmergencyRemove;
        this.TermUnits = TermUnits;
        this.teacher = teacher;
        this.department = department;
        this.AdvisorRequest = AdvisorRequest;
        this.Message = Message;
    }

    public Student(String SID, Major major, boolean ActiveStatus, boolean FinancalStatus, double Average, int TakenUnits, int PassedUnits, int FailedUnits, int WithdrawnUnits, int EmergencyRemove, int TermUnits, Department department, boolean AdvisorRequest, String Name, String Family, String Father, String nationalid, String Birthday, String Gender) {
        super(Name, Family, Father, nationalid, Birthday, Gender);
        this.SID = SID;
        this.major = major;
        this.ActiveStatus = ActiveStatus;
        this.FinancalStatus = FinancalStatus;
        this.Average = Average;
        this.TakenUnits = TakenUnits;
        this.PassedUnits = PassedUnits;
        this.FailedUnits = FailedUnits;
        this.WithdrawnUnits = WithdrawnUnits;
        this.EmergencyRemove = EmergencyRemove;
        this.TermUnits = TermUnits;
        
        this.department = department;
        this.AdvisorRequest = AdvisorRequest;
    }
    
    

    public Student() {
    }
    
    
    
}
