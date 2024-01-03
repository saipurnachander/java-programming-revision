package Arrays;
// Function to move odd number front
import java.util.Arrays;
public class Excersize_4 {
    static int[] odd_front(int[] Numbers){
        int[] a =  new int[Numbers.length];
        int count = 0 ;
        for (int i =0 ; i< Numbers.length;i++){
            if (Numbers[i]%2 != 0){
                a[count] = Numbers[i];
                count = count+1;
            }
        }
        for (int i =0 ; i< Numbers.length;i++){
            if (Numbers[i]%2 == 0){
                a[count] = Numbers[i];
                count = count + 1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(Excersize_4.odd_front(arr)));
    }
    
}
