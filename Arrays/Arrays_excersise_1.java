package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_excersise_1 {
    static int[] numbering(int... numbers){
        return numbers; 
    }
    public static void main(String[] args) {
        

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr_1[] = new int[n];
            if (n >= 1 || n<= 20) {
                // System.out.println(Arrays.toString(arr_1));
                for (int i = 0; i<n ; i++){
                    arr_1[i]=i;
                }
                System.out.println(Arrays.toString(arr_1));
            }
            System.out.println(Arrays.toString(Arrays_excersise_1.numbering(arr_1)));
        }

    }
}
