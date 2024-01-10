package Multi_dimentional_arrays;
// sum of each rows program
public class Excersize_1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{1,2,3,4}};
        for (int i =0 ; i < arr.length ; i++ ){
            int sum = 0;
            for(int j = 0 ;j < arr[0].length ;j++){
                sum = sum + arr[i][j];      
            }
            System.out.println(" sum of row "+(i+1) + ":"+sum);
        } 
    }
}
