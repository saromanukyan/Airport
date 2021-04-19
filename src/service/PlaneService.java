package service;

import model.Plane;

import java.util.Arrays;
import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter plane model");
        String model = s.next();

        System.out.println("Enter contry the plane belongs to");
        String country = s.next();

        System.out.println("Enter year of publishing");
        int year = s.nextInt();

        System.out.println("Enter hours in air");
        double hours = s.nextDouble();

        System.out.println("Enter plane is military, (y/n)");
        boolean isMilitary = s.next().charAt(0) == 'y';

        System.out.println("Enter weight of plane");
        double weight = s.nextDouble();

        System.out.println("Enter plane maximal speed");
        double speed = s.nextDouble();

        System.out.println("Enter number of seats");
        int seats = s.nextInt();

        System.out.println("Enter cost of the plane");
        double cost = s.nextDouble();

        Plane plane = new Plane();
        plane.setModel(model);
        plane.setCountry(country);
        plane.setYear(year);
        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setWeight(weight);
        plane.setTopSpeed(speed);
        plane.setSeats(seats);
        plane.setCost(cost);
        return plane;
    }

    public void printCostAndSpeedOrModelAndCountry(Plane plane) {
        System.out.println(plane.isMilitary() ? (plane.getCost() + " " + plane.getTopSpeed()) :
                (plane.getModel() + plane.getCountry()));
    }

    public Plane newerPlane(Plane p1, Plane p2) {
        return p1.getYear() >= p2.getYear() ? p1 : p2;
    }

    public void countryOfMinSeatsCount(Plane p1, Plane p2, Plane p3) {
        Plane min = p1.getSeats() <= p2.getSeats() ? p1 : p2;
        if (p3.getSeats() < min.getSeats()) {
            min = p3;
        }
        System.out.println(min.getCountry());
    }

    public void allNotMiliraryPlanes(Plane[] planes) {

        for (Plane plane : planes) {
            if (!plane.isMilitary()) plane.printInfo();
        }
    }

    public void militaryPlanesMore100Hours(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) plane.printInfo();
        }
    }
    public Plane planeWithMinWeight(Plane[]planes){
        Plane min=planes[0];
        for (int i = 1; i < planes.length; i++) {
            min=planes[i].getWeight()<min.getWeight()?planes[i]:min;
        }
        return min;
    }
    public Plane militaryMinCoastPlane(Plane[]planes){
        Plane minCoastPlane=null;
        for (Plane plane:planes){
            if (plane.isMilitary()){
                if (minCoastPlane==null)minCoastPlane=plane;
                else
                    if (plane.getCost()<minCoastPlane.getCost())minCoastPlane=plane;
            }
        }
        return minCoastPlane;
    }

    public void ascendingOrderByYear(Plane []planes){
        boolean isActive=true;
        int countOfFors=0;
        while (isActive){
            isActive=false;
            for (int i = 0; i < planes.length-1-countOfFors; i++) {
                if (planes[i].getYear()>planes[i+1].getYear()){
                    Plane temp=planes[i];
                    planes[i]=planes[i+1];
                    planes[i+1]=temp;
                    isActive=true;
                }
            }
            countOfFors++;
        }
        System.out.println(Arrays.toString(planes));
    }

}
