package Experiment3;

import java.util.*;
class X {
    int i;
    int j;
    X(int j,int i){
        this.j = j;
        this.i = i;
    }

    public int finalSum(){
        return this.i + this.j;
    }
}
class Y extends X{
    Y(int i, int j){
        super(i,j);
    }
    public int computeProduct(){
        return this.i*this.j;
    }
}
class Z extends Y{
    Z(int i, int j){
        super(i, j);
    }
}
public class Question33
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.print("Enter j: ");
        int j = sc.nextInt();
        Z z = new Z(i, j);
        System.out.println("Product: " + z.computeProduct());
        System.out.println("Sum: " +z.finalSum());
    }
}



