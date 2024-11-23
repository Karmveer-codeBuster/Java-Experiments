package Experiment3;

import java.util.*;
abstract class Figure {
    double pi=3.1420;
    double a;
    double v;
    double r;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}
class Cone extends Figure{
    double h;
    double s;

    Cone(double h, double s, double r){
        this.h = h;
        this.s = s;
        this.r = r;
    }

    public void calcArea(){
        this.a = this.pi*this.r*(this.r+this.s);
    }
    public void calcVol(){
        this.v = this.pi*(this.r)*(this.r)*(this.h)*(0.33);
    }
    public void dispArea(){
        System.out.println("Area: " + this.a);
    }
    public void dispVol(){
        System.out.println("Volume: " + this.v);
    }
}
class Sphere extends Figure{
    Sphere(double r){
        this.r = r;
    }
    public void calcArea(){
        this.a = 4*this.pi*this.r*this.r;
    }
    public void calcVol(){
        this.v = (1.33)*this.pi*this.r*this.r*this.r;
    }
    public void dispArea(){
        System.out.println("Area: " + this.a);
    }
    public void dispVol(){
        System.out.println("Volume: " + this.v);
    }
}
class Cylinder extends Figure{
    double h;
    Cylinder(double h, double r){
        this.h = h;
        this.r =r;
    }
    public void calcArea(){
        this.a = 2*this.pi*this.r*this.h;
    }
    public void calcVol(){
        this.v = this.pi*this.r*this.r*this.h;
    }
    public void dispArea(){
        System.out.println("Area: " + this.a);
    }
    public void dispVol(){
        System.out.println("Volume: " + this.v);
    }
}
public class Question32
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For Cone: ");
        System.out.print("Enter radius of cone: ");
        double rCone = sc.nextDouble();
        System.out.print("Enter height of cone: ");
        double hCone = sc.nextDouble();
        System.out.print("Enter slant height of cone: ");
        double sCone = sc.nextDouble();
        Cone cone = new Cone(hCone,sCone,rCone);

        System.out.println("For Sphere: ");
        System.out.print("Enter radius of sphere: ");
        double rSphere = sc.nextDouble();
        Sphere sphere = new Sphere(rSphere);
        
        System.out.println("For Cylinder: ");
        System.out.print("Enter radius of cylinder: ");
        double rCylinder = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double hCylinder = sc.nextDouble();
        Cylinder cylinder = new Cylinder(hCylinder, rCylinder);


        System.out.println("SPHERE: ");
        sphere.calcArea();
        sphere.calcVol();
        sphere.dispArea();
        sphere.dispVol();

        System.out.println("CYLINDER: ");
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.dispArea();
        cylinder.dispVol();

        System.out.println("CONE: ");
        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();
    }
}


