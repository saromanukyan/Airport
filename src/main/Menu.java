package main;

import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PlaneService service = new PlaneService();
        Plane plane1 = service.create();
        Plane plane2 = service.create();
        Plane plane3 = service.create();
        Plane plane4 = service.create();

        Plane[] planes = {plane1, plane2, plane3, plane4};

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("--- Enter command number ---");
            System.out.println("1. PrintCostAndSpeedOrModelAndCountry");
            System.out.println("2. NewerPlane");
            System.out.println("3. CountryOfMinSeatsCount");
            System.out.println("4. AllNotMiliraryPlanes");
            System.out.println("5. MilitaryPlanesMore100Hours");
            System.out.println("6. PlaneWithMinWeight");
            System.out.println("7. MilitaryMinCoastPlane");
            System.out.println("8. AscendingOrderByYear");
            System.out.println("9. Exit");
            int command = s.nextInt();
            switch (command) {
                case 1 -> service.printCostAndSpeedOrModelAndCountry(plane1);
                case 2 -> service.newerPlane(plane1, plane2).printInfo();
                case 3 -> service.countryOfMinSeatsCount(plane1, plane2, plane3);
                case 4 -> service.allNotMiliraryPlanes(planes);
                case 5 -> service.militaryPlanesMore100Hours(planes);
                case 6 -> service.planeWithMinWeight(planes).printInfo();
                case 7 -> service.militaryMinCoastPlane(planes).printInfo();
                case 8 -> service.ascendingOrderByYear(planes);
                case 9 -> {
                    isMenuActive = false;
                    System.out.println("Good Bye");
                }
                default -> System.out.println("Invalid command number");
            }

        }
    }
}
