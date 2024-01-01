package oops.polymorphism;
// public class is defined in its own seperate file;

class A{
    
    public void display(){
        System.out.println("A is running");
    }
}
class B extends A{
    @Override
    public void display(){
        System.out.println("B is running");
    }
}

public class dynamic_binding {
    public static void main(String[] args) {
        A object_1 = new B();
        object_1.display();
    }
}
