package oops.polymorphism;

class Animal {
    // final variable cannot be changed in the scope of the exsisting programme
    final String ani = " Tiger";
    Animal (){
        System.out.println(ani);
    }
}
// final class cannot be inherited --> period 
final class Student{
    int id ;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    // final method cannot be ovverridden
    final void display(){
        System.out.println( " name  : "+ this.name + " id : " + this.id );
    }
}
public class Testing_final {
    public static void main(String[] args) {
        Animal object_1 = new Animal();
        System.out.println(object_1);

        Student object_2 = new Student(21,"sai purna");
        System.out.println(object_2);
    }
    
}
