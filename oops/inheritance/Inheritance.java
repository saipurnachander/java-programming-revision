package oops.inheritance;
class Animal{
    
     Animal(){
        System.out.println("this is an animal");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("i am an animal and a dog");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        // obj.display_animal();
        // obj.display_dog();
        System.out.println(obj);
    }
    
}
