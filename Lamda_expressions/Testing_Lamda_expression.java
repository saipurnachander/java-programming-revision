package Lamda_expressions;
interface Car {
    public void drive();
}
class Tata implements Car
{ 
    public void drive(){
        System.out.println(" Tata is driving");
    }
}
class Audi implements Car
{
    public void drive(){
        System.out.println(" audi is driving");
    }
}

public class Testing_Lamda_expression {
    public static void main(String[] args) {
        Tata c1 = new Tata();
        c1.drive();
        Audi c2 = new Audi();
        c2.drive();
        
        Car Third_car = ()->{System.out.println("third car is driving");};
        Car mercedes = ()-> {System.out.println("mercedes is driving");};
        
        Third_car.drive();
        mercedes.drive();    
    }
        
    }
    

