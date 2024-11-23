package Experiment1;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        
 
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        
       
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
     
        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
        
        
        //sc.close();
    }
}

