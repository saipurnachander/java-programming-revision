package Arrays;
// equals () method 

// String str_1 = "hello";
import java.util.Arrays;
public class Testing_array_comparision {
    public static void main(String[] args) {
        String[] str_1 = {"hello"};
        String[] str_2 = {"hello"};
        System.out.println(str_1==str_2);  // this compares wether there are inn the same addresses
        System.out.println(str_1.equals(str_2)); // second way of using '==' method; 
        System.out.println(Arrays.equals(str_1,str_2));
        // equal method searches for value in the address 
        //equals method can be used only for arrays not for induvidual strings 
        // this can also used for string arrays, char arrays , int arrays and datatypes that is array datastructure
    }
}
