package Entity;

public class Human {
    
    private String Name, Family, Father, nationalid, Birthday, Gender;

    
    public Human(String Name, String Family, String Father, String nationalid, String Birthday, String Gender) {
        this.Name = Name;
        this.Family = Family;
        this.Father = Father;
        this.nationalid = nationalid;
        this.Birthday = Birthday;
        this.Gender = Gender;
    }

    public Human() {
    }
     
    public String getName() {
        return Name;
    }    
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFamily() {
        return Family;
    }
    public void setFamily(String Family) {
        this.Family = Family;
    }

    public String getFather() {
        return Father;
    }
    public void setFather(String Father) {
        this.Father = Father;
    }

    public String getNationalid() {
        return nationalid;
    }
    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    public String getBirthday() {
        return Birthday;
    }
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
}
