package Experiment1;
import java.util.Scanner;



public class Question1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		int product;
		int different;
		int Quotient;
		
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();
		
		sum = num1+num2;
		product = num1*num2;
		different = num1-num2;
		Quotient = num1/num2;
		
		System.out.println("Sum is "+sum);
		System.out.println("Product is "+product);
		System.out.println("Different is "+different);
		System.out.println("Quotient is "+Quotient);
		
		
	}

}
