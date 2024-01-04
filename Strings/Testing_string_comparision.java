package Strings;

public class Testing_string_comparision {
    public static void main(String[] args) {
        String name_1 = "sai purna chander reddy";
        String name_2 ="SAI PURNA CHANDER REDDY";
        System.out.println("compareTo() method :" +name_1.compareTo(name_2));
        System.out.println("'==' method "+ name_1==name_2);
        System.out.println("equals() method :"+name_1.equals(name_2));
        System.out.println("equalsIgnoreCase() method :"+name_1.equalsIgnoreCase(name_2));
    }
}
