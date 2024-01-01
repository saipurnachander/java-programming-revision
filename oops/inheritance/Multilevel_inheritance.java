package oops.inheritance;
class Animals{
    String a = " this is animal class ";
    Animals(){
        System.out.println(a);
    }
}
class Elephant extends Animals{
    String b = "this subclass of animal class and to be specific this is elephat class";
    Elephant(){
        System.out.println(b);
}}
class Rhino extends Animals{
    String c = " this is subclas of animal class and to be specific this is rhino class ";
    Rhino(){
        System.out.println(c);
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
        Elephant object_1 = new Elephant();
        Rhino object_2 = new Rhino();
        Animals object_3 = new Animals();
        System.out.println(object_1 +" "+ object_2+ " "+object_3 );
    }
}
