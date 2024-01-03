package Arrays;
import java.util.Arrays;
public class Filling_arrays {
    public static void main(String[] args) {
        String[] arr_1 = new String[4];
        int[] arr_2 = new int[4];
// Arrays.fill() method 
        Arrays.fill(arr_1, "hello");
        Arrays.fill(arr_2,3);
//  this method only works if there are default values in arrays;
        Arrays.fill(arr_2,1,3,3);  // this will not be executed as the array is filled with different values than default values
        // for ( String i : arr_1){
        //     System.out.println(i);
        // }
        for ( int i : arr_2){
            System.out.println(i);
        }
        String[] str_3 = {"hello ","world"};
        System.out.println(Arrays.toString(str_3));
        System.out.println(Arrays.toString(arr_1));
        System.out.println(Arrays.toString(arr_2));
    }
}