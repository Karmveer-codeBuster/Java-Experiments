package Experiment2;

import java.util.*;
class Employee{
    String name;
    String lastName;
    double monthlySalary;
    double yearlySalary;

    Employee(String name,String last,double sal){
        this.name = name;
        this.lastName = last;
        if(sal>0){
            this.monthlySalary = sal;
        }
        
    }
    
   
    void setName(String name){
        this.name = name;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void setMonthlySalary(double salary){
        if(salary>0){
            this.monthlySalary = salary;
        }
    }

    
    double getMonthlySalary(){
        return this.monthlySalary;
    }
    String getLastName(){
        return this.lastName;
    }
    String getName(){
        return this.name;
    }

    
    void calculateYearlySalary(){
        this.yearlySalary = this.monthlySalary*12;
    }
    void displayYearlySalary(){
        System.out.println("The yearly salary  of " + this.name + " " + this.lastName + " is: " + this.yearlySalary);
    }
    void hike(double percent){
        this.yearlySalary = (this.yearlySalary)*(percent/100) + (this.yearlySalary);
    }
}
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("Mohan", "Das", 7700);
        Employee e2 = new Employee("Ravi", "Chauhan", 8000);
        e1.calculateYearlySalary();
        e2.calculateYearlySalary();
        
        e1.displayYearlySalary();
        e2.displayYearlySalary();
        
        System.out.print("Enter the percentage hike: ");
        double hike = sc.nextDouble();
        e1.hike(hike);
        e2.hike(hike);
        System.out.println(" AFTER HIKE:-");
        e1.displayYearlySalary();
        e2.displayYearlySalary();
        
        sc.close();
        
        
    }
}





