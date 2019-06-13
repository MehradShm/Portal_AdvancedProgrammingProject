package db;

import Entity.*;

import java.sql.*;
import java.util.*;

public class Database {
    
    ArrayList <Department> department;
    ArrayList <Major> major;
    ArrayList <Subject> subject;
    ArrayList <AdvanceSubject> advanceSubject;
    ArrayList <Teacher> teacher;
    ArrayList <Student> student;
    public Database(ArrayList<Department> d, ArrayList<Major> m, ArrayList<Subject> sub, ArrayList<AdvanceSubject> as, ArrayList<Teacher> t, ArrayList<Student> s ) {
        this.department = d;
        this.major = m;
        this.subject = sub;
        this.advanceSubject = as;
        this.teacher = t;
        this.student = s;
        
        for (int i = 0; i < this.getDepartmentNumLine(); i++) {
            department.add(new Department());
        }
        for (int i = 0; i < this.getMajorNumLine(); i++) {
            major.add(new Major());
        }
        for (int i = 0; i < this.getSubjectNumLine(); i++) {
            subject.add(new Subject());
        }
        for (int i = 0; i < this.getAdvanceSubjectNumLine(); i++) {
            advanceSubject.add(new AdvanceSubject());
        }
        for (int i = 0; i < this.getTeacherNumLine(); i++) {
            teacher.add(new Teacher());
        }
        for (int i = 0; i < this.getStudentNumLine(); i++) {
            student.add(new Student());
        }
    
    }
    
    
    public Database(ArrayList<Teacher> t, ArrayList<Student> s){
        
        this.teacher = t;
        this.student = s;
        
        for (int i = 0; i < this.getTeacherNumLine(); i++) {
            teacher.add(new Teacher());
        }
        for (int i = 0; i < this.getStudentNumLine(); i++) {
            student.add(new Student());
        }
        
    }

    public Database(ArrayList<Department> department) {
        this.department = department;
        for (int i = 0; i < this.getDepartmentNumLine(); i++) {
            department.add(new Department());
        }
    }
    public int getTimeNumLine(){
        try {
        String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.TIME";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getDepartmentNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.DEPARTMENT";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getMajorNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.MAJORS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getSubjectNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.SUBJECTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getAdvanceSubjectNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.ADVANCEDSUBJECTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getTeacherNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.TEACHERS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    public int getStudentNumLine(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.STUDENTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            
            while(rs.next()){
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
            return i;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    /*
    public void readTime(){
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.DEPARTMENT";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString("NAME");
                department.get(i).setName(name);
                
                System.out.println(name);
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
    }*/
    public void readDepartment(){
        
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.DEPARTMENT";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString("NAME");
                department.get(i).setName(name);
                
                System.out.println(name);
                
                
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    public void readMajor(){
        
        try {
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.MAJORS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name =rs.getString("NAME");
                String departmentname = rs.getString("DEPARTMENTNAME");
                
                for (int j = 0; j < this.getDepartmentNumLine(); j++) {
                    String h = department.get(j).getName();
                    if (h.equals(departmentname)) {
                        major.get(i).setD(department.get(j));
                    }
                }
                
                major.get(i).setName(name);
                
                
                
                i++;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    public void readSubject(){
        
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.SUBJECTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString("NAME");
                int unit = rs.getInt("UNITS");
                String majorn = rs.getString(5);
                int numberPrerequisite = rs.getInt(6);
                
                subject.get(i).setName(name);
                subject.get(i).setUnits(unit);
                subject.get(i).setMajorName(majorn);
                subject.get(i).setNumberofPrerequisite(numberPrerequisite);
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    public void readStudent(){
        
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.STUDENTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString(2);
                String family = rs.getString(3);
                String father = rs.getString(4);
                String nationalid = rs.getString(5);
                String birthday = rs.getString(6);
                String gender = rs.getString(7);
                String sid = rs.getString(8);
                boolean activestatus = rs.getBoolean(9);
                double average = rs.getDouble(10);
                int takenunit = rs.getInt(11);
                int passedunit = rs.getInt(12);
                int failedunit = rs.getInt(13);
                int withdrawnunit = rs.getInt(14);
                int emergencyremove = rs.getInt(15);
                int termunit = rs.getInt(16);
                String aid = rs.getString(17);
                String departmentname = rs.getString(18);
                String majorname = rs.getString(19);
                
                                
                
                //this.getDepartmentNumLine();
                //this.readDepartment();
                for (int j = 0; j < this.getDepartmentNumLine(); j++) {
                    //System.out.println(department.size());
                    String h = department.get(j).getName();
                    if (h.equals(departmentname)) {
                        student.get(i).setDepartment(department.get(j));
                    }
                }
                
                //this.readMajor();
                for (int j = 0; j < this.getMajorNumLine(); j++) {
                    String h = major.get(j).getName();
                    if (h.equals(majorname)) {
                        student.get(i).setMajor(major.get(j));
                    }
                }
                
                
                student.get(i).setName(name);
                student.get(i).setFamily(family);
                student.get(i).setFather(father);
                student.get(i).setNationalid(nationalid);
                student.get(i).setBirthday(birthday);
                student.get(i).setGender(gender);
                student.get(i).setSID(sid);
                student.get(i).setActiveStatus(activestatus);
                student.get(i).setAverage(average);
                student.get(i).setTakenUnits(takenunit);
                student.get(i).setPassedUnits(passedunit);
                student.get(i).setFailedUnits(failedunit);
                student.get(i).setWithdrawnUnits(withdrawnunit);
                student.get(i).setEmergencyRemove(emergencyremove);
                student.get(i).setTermUnits(termunit);
                //student.get(i).setTeacher(aid);
                
                
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    public void readTeacher(){
        
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.TEACHERS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString(2);
                String family = rs.getString(3);
                String father = rs.getString(4);
                String nationalid = rs.getString(5);
                String birthday = rs.getString(6);
                String gender = rs.getString(7);
                String tid = rs.getString(8);
                String speciality = rs.getString(9);
                String deparmentname = rs.getString(10);
                double income = rs.getDouble(11);
                int presentunit = rs.getInt(12);
                String majorname = rs.getString(12);
                String studentid = rs.getString(13);
                
                
                for (int j = 0; j < this.getStudentNumLine(); j++) {
                    String h = student.get(j).getSID();
                    if (h.equals(studentid)) {
                        teacher.get(i).setStudents(student.get(j));
                        
                    }
                }
                
                
                for (int j = 0; j < this.getMajorNumLine(); j++) {
                    String h = major.get(j).getName();
                    if (h.equals(majorname)) {
                        teacher.get(i).setMajor(major.get(j));
                    }
                }
                
                
                teacher.get(i).setName(name);
                teacher.get(i).setFamily(family);
                teacher.get(i).setFather(father);
                teacher.get(i).setNationalid(nationalid);
                teacher.get(i).setBirthday(birthday);
                teacher.get(i).setGender(gender);
                teacher.get(i).setID(tid);
                teacher.get(i).setSpeciality(speciality);
                teacher.get(i).setDepartmentName(deparmentname);
                teacher.get(i).setIncome(income);
                teacher.get(i).setPresentUnit(presentunit);
                
                System.out.println(studentid);
                
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    public void readAdvanceSubject(){
        
        try{
            
            String host = "jdbc:derby://localhost:1527/autDB";
            String username = "root", password = "root";
            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM ROOT.ADVANCEDSUBJECTS";
            ResultSet rs = stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()){
                
                String name = rs.getString(2);
                int unit = rs.getInt(3);
                String teacherid = rs.getString(4);
                int capacity = rs.getInt(5);
                String departmentname = rs.getString(6);
                int group = rs.getInt(7);
                
                for (int j = 0; j < this.getDepartmentNumLine(); j++) {
                    String h = department.get(j).getName();
                    if (h.equals(departmentname)) {
                        advanceSubject.get(i).setDepartment(department.get(j));
                    }
                }
                
                for (int j = 0; j < this.getTeacherNumLine(); j++) {
                    String h = teacher.get(j).getID();
                    if (h.equals(teacherid)) {
                        advanceSubject.get(i).setTeacher(teacher.get(j));
                    }
                }
                
                
                
                
                advanceSubject.get(i).setName(name);
                advanceSubject.get(i).setUnits(unit);
                advanceSubject.get(i).setCapacity(capacity);
                //advanceSubject.get(i).setClassTime();
                advanceSubject.get(i).setGroup(group);
                
                i++;        
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException ex){System.out.println(ex.getMessage());}
        
    }
    
}
