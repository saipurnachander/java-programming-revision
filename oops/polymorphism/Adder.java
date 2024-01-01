// testing method overloading 
package oops.polymorphism;
// this is compile time polymorphism
class Adder{  
    public int add(int a,int b){return a+b;}  
    public int add(int a,int b,int c){return a+b+c;}  

    static int add_(int a,int b){return a+b;}  
    static int add_(int a,int b,int c){return a+b+c;}

    }

class TestOverloading1{  
    public static void main(String[] args){  
        Adder obj = new Adder();

        //  output for public methods
        System.out.println(obj.add(1, 1));
        System.out.println(obj.add(1, 1, 1));
        // output for static methods
        System.out.println(Adder.add_(11,11));  
        System.out.println(Adder.add_(11,11,11));  
    }}  
