package oops.polymorphism;
// if this code is not working remove it out of the folder and run it properly;
class Person{
    int id;
    String Name;
    Person(int id, String Name){
        this.id = id;
        this.Name = Name;
    }
}
class Student extends Person{

    String department;
    Student(int id, String Name,String department) {
        super(id, Name);
        this.department = department;
    }
}
class professor extends Person{
    String department;
    professor(int id, String Name,String department) {
        super(id, Name);
        this.department = department;
    }
    
}
public class Testing_instanceof_operator {
    public static void main(String[] args) {
        Student obj1= new Student(1, "saipurna", "cse");
        professor obj2 = new professor(22, "indrakshi ray", "computer science");
        System.out.println(obj1 instanceof Person);
        System.out.println(obj2 instanceof Person);
        System.out.println(obj2 instanceof professor);
    }
}
