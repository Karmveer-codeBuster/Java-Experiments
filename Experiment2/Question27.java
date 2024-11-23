package Experiment2;

import java.util.Scanner;

public class Question27 {
    public static double calculateCharge(double hoursParked) {
        double charge;
        
        if (hoursParked <= 3) {
            charge = 2.00;
        }
        
        else {
            double excessHours = Math.ceil(hoursParked - 3);
            charge = 2.00 + (excessHours * 0.50);
            
            if (charge > 10.00) {
                charge = 10.00;
            }
        }
        
        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalReceipts = 0.0;
        String continueParking = "";
        
        do {
            System.out.print("Enter the number of hours parked: ");
            double hoursParked = sc.nextDouble();
            
            if (hoursParked < 0) {
                System.out.println("Invalid hours. Please enter a positive value.");
                continue;
            }

            double charge = calculateCharge(hoursParked);
            
            System.out.println("Parking charge for this customer: $" + charge);
            
            totalReceipts += charge;
            
            System.out.print("Do you want to enter another customer? (yes/no): ");
            continueParking = sc.next();
            
        } while (continueParking.equalsIgnoreCase("yes"));
        
        System.out.println("\nTotal receipts for yesterday: $" + totalReceipts);
        
        sc.close();
    }
}



