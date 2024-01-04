package Strings;
// toUpperCase()---> changes string to uppercase
// toLowerCase()---> changes string to lowercase
// trim()---> removes gaps infront and rear of string
// startsWith() and endsWith() ----> checks starting and ending values with respective to arguments passed
// valueOf()-----> changes any datatype to string 
// replace() ------> function replaces specific substring in the string
// import java.util.*;
public class Testing_string_class_methods {
    public static void main(String[] args) {
        String name = "sai purna chander reddy";
        name = name.toUpperCase();
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.startsWith("SA"));
        System.out.println(name.startsWith("A"));
        // String s = new String.valueOf(i);
        System.out.println(name.replace("SAI", ""));
        }

    
}
