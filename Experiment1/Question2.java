package Experiment1;
import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        
        
        if(num1>num2)
        {
        	System.out.println(num1 +" is Larger");
        }
        else if(num2>num1)
        {
        	System.out.println(num2 +" is Larger");
        }
        else
        {
        	System.out.println("The numbers are Equal");
        	
        }
		
	}

}
