package Arrays;
// import java.util.Arrays;
// checking weather element is repeated in an array if yes how many times?
// main method has max and minimum in array 
public class Excersize_3 {
    static int repeated(int[] nums, int x){
        int count = 0;
        for (int j =0; j< nums.length ;j++){
            if (nums [j] == x ){
                count = count+1;}}
        return count;
    }
    static int[] Occurance_count(int[] Numbers){
        int[] b = new int[Numbers.length];
        for (int i = 0 ; i< Numbers.length;i++){
            b[i] = Excersize_3.repeated(Numbers,Numbers[i]);
        }
        return b;
    }
    static int[] repeated_count(int[] Numbers){
        int[] b = new int[Numbers.length];
        // int count = 0;
        for (int i = 0 ; i< Numbers.length;i++){
            int count = 0;
            for (int j = 0 ; j< Numbers.length;j++){
                if(Numbers[i]==Numbers[j]){
                    count = count +1;
                    b[j] = count;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,1,2,3,4,3,5,2,6,6};
        int[] a2 = new int[a1.length];
        a2 = Excersize_3.Occurance_count(a1);
        int[] a3 = new int[a1.length];
        a3 = Excersize_3.repeated_count(a1);
        int max = 0;
        int min = 0;
        for (int i = 0;i<a1.length;i++){
            for (int j = 0;j<a1.length;j++){
                if (a1[i] > a1[j]){
                    max = a1[i];
                }
            }
        }
        for (int i = 0;i<a1.length;i++){
            for (int j = 0;j<a1.length;j++){
                if (a1[j] < a1[i]){
                    min = a1[j];
                }
            }
        }
        System.out.println("maximum in array : "+max);
        System.out.println("minimum in array : "+min);
        for (int i = 0 ; i< a1.length ; i ++){
            if(a3[i]== 1){
                System.out.println(a1[i] + " repeated " + a2[i] +" times");
            }
        }
    }   
}