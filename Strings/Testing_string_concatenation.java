package Strings;
// concat() method but, we mostly prefer + operator
public class Testing_string_concatenation {
    public static void main(String[] args) {
        String first_name = "sai purna chander reddy ";
        String Last_name = "Reddy";
        System.out.println(first_name+Last_name);
        System.out.println(1+2+first_name+Last_name+3+4);
        System.out.println(1+2+" "+first_name+" ,"+Last_name+" "+(3+4));
        System.out.println(first_name.concat(Last_name));
    }
}
