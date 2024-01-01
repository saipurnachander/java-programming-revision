package oops.polymorphism;
class Person{
    int id;
    String Name;
    Person(int id, String Name){
        this.id = id;
        this.Name=Name;
    }
}
class Employee extends Person{
    float sal;
    Employee(int id, String Name, float sal) {
        super(id, Name);
        this.sal = sal;
    }
    public void display(){
        System.out.println("name : "+ this.Name + " , id :" +this.id + " , salary :" + this.sal);
    }
}

public class Testing_super {
    public static void main(String[] args) {
        Employee object_1 = new Employee(1, "sai purna",(float) 24.456);
        object_1.display();


    }
    
}
