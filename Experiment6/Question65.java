package Experiment6;

class Bank{
    int deposit(int amt, int balance){
        return amt+balance;
    }
    int withdraw(int amt, int balance){
        return balance>=amt?(balance-amt):0;
    }
}
public class Question65 {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.deposit(2000, 12050));
        System.out.println(b.withdraw(220, 14050));
        System.out.println(b.withdraw(12000, 1100));
    }
}

