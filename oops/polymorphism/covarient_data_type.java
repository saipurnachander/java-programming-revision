package oops.polymorphism;
// method overriding return type must be same data type in parent and sub class for primitive data types
// if not it must be non primitive data types
class A{
    A method_1(){
        System.out.println("i am in A");
        return new A();
    }
}
class B extends A{
    B method_1(){
        System.out.println("i am in B");
        return new B();
    }
}
public class covarient_data_type {
    public static void main(String[] args) {
        A object_1 = new A();
        System.out.println(object_1.method_1());

        B object_2 = new B();
        System.out.println(object_2.method_1());
    }
    
}
