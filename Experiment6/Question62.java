package Experiment6;

import java.util.*;
class MovieTheatre{
    double perTicket = 5;
    double performanceCost = 20;
    double perAttendeeCost = 0.50;
    int numberOfAttendees;

    MovieTheatre(int numberOfAttendees){
        this.numberOfAttendees = numberOfAttendees;
    }

    double profitProgram(){
        double grossIncome = numberOfAttendees*perTicket;
        double cost = numberOfAttendees*perAttendeeCost + performanceCost;
        return grossIncome-cost;
    }
}
public class Question62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of attendees in the theatre for the show: ");
        int noOfAttendees = sc.nextInt();
        MovieTheatre theatre = new MovieTheatre(noOfAttendees);
        double profit = theatre.profitProgram();
        System.out.println("Total Net Profit made by the theatre is $" + profit);
    }
}

