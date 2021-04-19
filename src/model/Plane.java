package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean isMilitary;
    private double weight;
    private double topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model == null ? "unknown" : model;
    }

    public void setModel(String model) {
        if (model.length() == 0) System.out.println("model name is empty");
        else this.model = model;
    }

    public String getCountry() {
        return country == null ? "unknown" : country;
    }

    public void setCountry(String country) {
        if (country.length() == 0) System.out.println("country name is empty");
        else this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1903 || year > 2020) System.out.println("incorrect year");
        else this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 10000) {
            System.out.println("incorrect hours value");
            this.hours=-1;
        }
        else this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<1000 ||weight>160000) System.out.println("incorrect weight value");
        else this.weight = weight;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (topSpeed<0) {
            System.out.println("incorrect topSpeed value");
            this.topSpeed=-1;
        }
        else this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats<0) {
            System.out.println("incorrect seats count");
            this.seats=-1;
        }
       else this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost<0) {
            System.out.println("incorrect cost value");
            this.cost=-1;
        }
        else this.cost = cost;
    }
    public void printInfo(){
        System.out.println("-------------------");
        System.out.printf ("Model:       %s%n", getModel());
        System.out.printf ("Country:     %s%n", getCountry());
        System.out.println("Year:        "+(getYear()==0?"unknown":getYear()));
        System.out.println("Hours:       "+(getHours()==-1?"unknown": getHours()+" hours in air"));
        System.out.printf ("Is Military: %s%n", isMilitary ? "YES" : "NO");
        System.out.println("Weight:      "+(getWeight()==0?"unknown":(getWeight()+" KG")));
        System.out.println("MaxSpeed:    "+(getTopSpeed()==-1?"unknown":(getTopSpeed()+" km/h")));
        System.out.println("Seats:       "+(getSeats()==-1?"unknown":(getSeats()+" seats")));
        System.out.println("Coast:       "+(getCost()==-1?"unknown": ("$"+getCost())));
    }

}
