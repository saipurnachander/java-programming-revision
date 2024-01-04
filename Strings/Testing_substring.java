package Strings;
// substring(start,end)
// split() function 
import java.util.Arrays;
public class Testing_substring {
    public static void main(String[] args) {
        String name = "sai purna chander reddy";
        System.out.println(name.substring(4,9));
        String[] chars = name.split(" ");
        System.out.println(Arrays.toString(chars));
    }
}
