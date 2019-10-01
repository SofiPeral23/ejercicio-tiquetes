package tallerpoopunto2;


public class Tiquetes {
    
    private float cost;
    private String Date,nameP,numTravel;
    private int hour;

    public Tiquetes(String numTravel, float cost, String Date, String nameP, int hour) {
        this.numTravel = numTravel;
        this.cost = cost;
        this.Date = Date;
        this.nameP = nameP;
        this.hour = hour;
    }

    
    
    public String getNumTravel() {
        return numTravel;
    }

    public void setNumTravel(String numTravel) {
        this.numTravel = numTravel;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
}
