package Lamda_expressions;
interface Measure {
    public void area(int ... a);
    // public int area(int ... a);
}

public class Testing_lamda_expression_2 {
    public static void main(String[] args) {

        Measure rectangle = (int ... l1)-> {System.out.println("measuring area of rectangle :" + (l1[0]*l1[1])); };
        rectangle.area(2,3);

        // with return statement 
        // Measure rectangle = (int ... l1)-> {return (l1[0]*l1[1]);};// with return statement
        // System.out.println("area of rectangle :"+(rectangle.area(2,3)));

        // Measure circle = (int ... r )->{return ((22 / 2)  * r[0]* r[0]);};
        // System.out.println("measuring area of circle:" + (circle.area(4)));

        Measure circle = (int... r)->{System.out.println("measuring area of circle :" + (3.14*r[0]*r[0]));}; // //without return statements
        circle.area(4);
}
}
