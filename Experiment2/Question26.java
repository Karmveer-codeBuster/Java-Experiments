package Experiment2;

import java.util.*;

class Customer {
    int accountNumber;
    double balanceAtBeginning;
    double totalCharges;
    double totalCredit;
    double creditLimit;
    double netBalance;

    public Customer(int accountNumber, double balanceAtBeginning, double creditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtBeginning = balanceAtBeginning;
        this.creditLimit = creditLimit;
    }

    void calculateNetBalance() {
        this.netBalance = this.balanceAtBeginning - this.totalCharges - this.totalCredit;
    }

    double getNetBalance() {
        return this.netBalance;
    }

    boolean isCreditLimitExceeded() {
        return this.netBalance < this.creditLimit;  // Should be netBalance < creditLimit to check limit exceeded
    }
}

class CreditLimitCalculator {
    static void processCustomer(Customer customer) {
        if (customer.isCreditLimitExceeded()) {
            System.out.println("ALERT! CREDIT LIMIT IS EXCEEDED!");
        } else {
            System.out.println("CREDIT LIMIT IS NOT EXCEEDED!");
        }
    }
}

public class Question26
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter balance at beginning: ");
        double balanceAtBeginning = sc.nextDouble();
        System.out.print("Enter total charges: ");
        double totalCharges = sc.nextDouble();
        System.out.print("Enter total credit: ");
        double totalCredit = sc.nextDouble();
        System.out.print("Enter credit limit: ");
        double creditLimit = sc.nextDouble();

        Customer customer = new Customer(accountNumber, balanceAtBeginning, creditLimit);
        customer.totalCharges = totalCharges;
        customer.totalCredit = totalCredit;

        customer.calculateNetBalance();

        // Display details
        System.out.println(".......................DETAILS......................."); 
        System.out.println("ACCOUNT NUMBER: " + customer.accountNumber);
        System.out.println("NET BALANCE: " + customer.getNetBalance());

        CreditLimitCalculator.processCustomer(customer);
        sc.close();  
    }
}

