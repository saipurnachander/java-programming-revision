package Arrays;
import java.util.Arrays;
public class Arrays_class {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,9};
        // sorting form index 3 to lenght -1 
        Arrays.sort(arr,3,arr.length);
        for (int i : arr){ // this is similar to ------>  for(int i = 0 ; i< arr.length ;i++) {
            System.out.print(i);
        }
        System.out.println("");
        Arrays.sort(arr);  
        for (int i : arr){ // this is similar to ------>  for(int i = 0 ; i< arr.length ;i++) {
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("string arrays : ");
        String[] str = {"beh","adg","cfi"};
        Arrays.sort(str);
        for (String i : str){
            System.out.print(i + " -- ");
        }
    }
}