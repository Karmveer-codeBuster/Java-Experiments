package Experiment2;

import java.util.*;

class Date{
    int day;
    int month;
    int year;

    Date(int day,int month, int year){
        if(day>31 || month>12){
            System.out.println("INVALID DATE INPUT");
        } else{
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    //setters
    void setDay(int day){
        this.day = day;
    }
    void setMonth(int month){
        this.month = month;
    }
    void setYear(int year){
        this.year = year;
    }

    //getters
    int getDay(){
        return this.day;
    }
    int getMonth(){
        return this.month;
    }
    int getYear(){
        return this.year;
    }

    //methods
    void displayDate(){
        System.out.println("Date is: " + this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }
}
public class Question24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        Date date = new Date(day, month, year);
        date.displayDate();
    }
}

