package oops.Abstraction;
public class TEST {
    public static void main(String[] args) {
        Student object_1 = new Student("sai purna", "male", 0);
        Student object_2 = new Student("sai prasanna", "female", 21);
        Student object_3 = new Student("sirisha ", "female", 22);
        
        object_1.studying();
        object_1.tostring();
        object_2.studying();
        object_2.tostring(); 
        object_3.studying();
        object_3.tostring(); 
    }   
}

