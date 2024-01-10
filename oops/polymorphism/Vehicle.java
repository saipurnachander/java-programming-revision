package oops.polymorphism;
// this is an example for run time polymorphism
public class Vehicle {
    public void run(){
        System.out.println("vehicle is running");
    }
}
class bike_1 extends Vehicle{
    public void run(){
        super.run();
        System.out.println("bike 1 is running");
    }
}
class Testing_method_overriding{
    public static void main(String[] args) {
        System.out.println("");
        bike_1 obj = new bike_1();
        obj.run();
    }
}
