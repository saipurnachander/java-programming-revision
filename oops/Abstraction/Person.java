package oops.Abstraction;

public abstract class Person {
    public static String name;
    String Name;
    String Gender;
    Person(String Name ,String Gender){
        this.Name = Name;
        this.Gender = Gender; 
    }
    public abstract void studying();

    public void tostring(){
        System.out.println(" name : "+this.Name + " Gender : "+ this.Gender);
    }
}
