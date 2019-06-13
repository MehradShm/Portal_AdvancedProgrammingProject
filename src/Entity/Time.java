package Entity;

public class Time {
    
    private String Day;
    private int StartTimehour , EndTimehour , StartTimeminute , EndTimeminute;

    public String getDay() {
        return Day;
    }
    public void setDay(String Day) {
        this.Day = Day;
    }

    public int getStartTimehour() {
        return StartTimehour;
    }
    public void setStartTimehour(int StartTimehour) {
        this.StartTimehour = StartTimehour;
    }

    public int getEndTimehour() {
        return EndTimehour;
    }
    public void setEndTimehour(int EndTimehour) {
        this.EndTimehour = EndTimehour;
    }

    public int getStartTimeminute() {
        return StartTimeminute;
    }
    public void setStartTimeminute(int StartTimeminute) {
        this.StartTimeminute = StartTimeminute;
    }

    public int getEndTimeminute() {
        return EndTimeminute;
    }
    public void setEndTimeminute(int EndTimeminute) {
        this.EndTimeminute = EndTimeminute;
    }

    public Time(String Day, int StartTimehour, int EndTimehour, int StartTimeminute, int EndTimeminute) {
        this.Day = Day;
        this.StartTimehour = StartTimehour;
        this.EndTimehour = EndTimehour;
        this.StartTimeminute = StartTimeminute;
        this.EndTimeminute = EndTimeminute;
    }
    
    @Override
    public String toString() {
        String s = new String (Day +  StartTimehour + ":" + StartTimeminute + " - " + EndTimehour + ":" + EndTimeminute);
        return s;
    }
    
    public boolean CheckTimeConflictwith(Time t){
        if(this.Day.equals(t.getDay()))
        {    
            int thisStart , thisEnd , tStart , tEnd;
            thisStart=( this.getStartTimehour()*60) + ( this.StartTimeminute);
            thisEnd=( this.getEndTimehour()*60) + (this.getEndTimeminute());
            tStart= (t.getStartTimehour()*60) + (t.getStartTimeminute());
            tEnd= (t.getEndTimehour()*60) + (t.getEndTimeminute());
            if((tStart<=thisEnd && tStart>=thisStart) || (tEnd<= thisEnd && tEnd>=thisStart))
                return true;
        }
        return false;
    }
    
}
