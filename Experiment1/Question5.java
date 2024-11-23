package Experiment1;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();
        
        if (num >= 10000 && num <= 99999) {
            
            int digit1 = num / 10000;              
            int digit2 = (num / 1000) % 10;        
            int digit3 = (num / 100) % 10;         
            int digit4 = (num / 10) % 10;          
            int digit5 = num % 10;                 
            
           
            System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        } else {
            System.out.println("Please enter a valid 5-digit number.");
        }
        
      
        //sc.close();
    }
}

