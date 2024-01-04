package Strings;
// charAt() funtion --> this function gives me specific character at particular index in a string
// .length()---> this is used to find length of string
public class Testing_string_functions {
     
    public static void main(String[] args) {
        String name = "Sai Purna Chander Reddy,Karra";
        System.out.println("character at given index :"+name.charAt(5));// character at index 5
        // System.out.println(" character at "+name.charAt(75));// this gives arrayindexoutofboudsexception
        System.out.println("last character in given string , character : "+name.charAt(name.length()-1));
    
    }
}
