package Experiment2;

import java.util.Scanner;

class DrivingCost {
    private double totalMiles;
    private double costPerGallon;
    private double milesPerGallon;
    private double parkingFees;
    private double tolls;

   
    public DrivingCost(double totalMiles, double costPerGallon, double milesPerGallon, double parkingFees, double tolls) {
        this.totalMiles = totalMiles;
        this.costPerGallon = costPerGallon;
        this.milesPerGallon = milesPerGallon;
        this.parkingFees = parkingFees;
        this.tolls = tolls;
    }

  
    private double calculateFuelCost() {
        return (totalMiles / milesPerGallon) * costPerGallon;
    }

    
    public double calculateTotalCost() {
        return calculateFuelCost() + parkingFees + tolls;
    }

   
//    public void calculateCarpoolSavings(int numPeople) {
//        if (numPeople > 1) {
//            double totalCost = calculateTotalCost();
//            double carpoolCost = totalCost / numPeople;
//            double savings = totalCost - carpoolCost;
//
//            System.out.printf("Cost per person when carpooling: Rs.%.2f%n", carpoolCost);
//            System.out.printf("Potential savings per day by carpooling: Rs.%.2f%n", savings);
//        } else {
//            System.out.println("Carpooling requires at least one other person.");
//        }
//    }

    
    public void displayCostSummary() {
        double fuelCost = calculateFuelCost();
        double totalCost = calculateTotalCost();

        System.out.println("\n--- Daily Driving Cost Summary ---");
        System.out.printf("Fuel cost per day: Rs.%.2f%n", fuelCost);
        System.out.printf("Parking fees per day: Rs.%.2f%n", parkingFees);
        System.out.printf("Tolls per day: Rs.%.2f%n", tolls);
        System.out.printf("Total daily driving cost: Rs.%.2f%n", totalCost);
    }
}

public class Question21  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the total miles driven per day: ");
        double totalMiles = sc.nextDouble();

        System.out.print("Enter the cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter the average miles per gallon of your car: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter the parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.print("Enter the tolls per day: ");
        double tolls = sc.nextDouble();

        
        DrivingCost calculator = new DrivingCost(totalMiles, costPerGallon, milesPerGallon, parkingFees, tolls);

       
        calculator.displayCostSummary();

        
//        System.out.print("\nEnter the number of people in the carpool (including yourself): ");
//        int numPeople = sc.nextInt();
//        calculator.calculateCarpoolSavings(numPeople);

        sc.close();
    }
}
