package Experiment6;

abstract class Car{
    String brand;
    Car(String brand){
        this.brand = brand;
    }
    void displayBrand(){
        System.out.println("Brand: " + this.brand);
    }
    abstract void avg();
    abstract void mode();
}

class Maruti extends Car{
    int mileage;
    String model;
    Maruti(int mileage, String model){
        super("Maruti");
        this.mileage = mileage;
        this.model = model;
    }
    void avg(){
        System.out.println("This Car of Maruti gives an average of " + this.mileage +"km/hr");
    }
    void mode(){
        System.out.println("Maruti: " + this.model);
    }
}
class Santro extends Car{
    int mileage;
    String model;
    Santro(int mileage,String model){
        super("Santro");
        this.mileage = mileage;
        this.model = model;
    }
    void avg(){
        System.out.println("This Car of Santro gives an average of " + this.mileage +"km/hr");
    }
    void mode(){
        System.out.println("Santro: " + this.model);
    }
}
class Car1{

}
public class Question64 {
    public static void main(String[] args) {
        Car maruti800 = new Maruti(30,"800");
        maruti800.displayBrand();
        maruti800.mode();
        maruti800.avg();
        Car santro = new Santro(27,"120");
        santro.displayBrand();
        santro.mode();
        santro.avg();
    }
}



