package oops.Interface;
interface shape{
    void draw();
    void Area();
}
class Rectangle implements shape{
    int length ;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth=breadth;
    }
    @Override
    public void draw() {
        System.out.println("rectanle is drawn...");    
    }
    @Override
    public void Area() {
       System.out.println("Area of Rectangle :  "+this.length * this.breadth);
    }
}
class circle implements shape{
    double pi = 3.14;
    int Radius;
    circle(int Radius){
        this.Radius = Radius;
    }

    @Override
    public void draw() {
        System.out.println("circle is drawn");
    }

    @Override
    public void Area() {
        System.out.println(" Area of circle : "+pi * this.Radius * this.Radius);
    }
    
}

public class Testing_interface {
    public static void main(String[] args) {
        circle c = new circle(22);
        c.Area();
        c.draw();
        Rectangle r = new Rectangle(12, 24);
        r.Area();
        r.draw();
    }
    
}
