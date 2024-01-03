package Multi_dimentional_arrays;

public class Excersize_2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{1,2,3,4}};
        for (int i =0 ; i < arr.length ; i++ ){
            int max = arr[i][0];
            for(int j = 0;j < arr[0].length;j++){
                max = Math.max(max, arr[i][j]);
            }
            System.out.println("maximum of row "+(i+1)+":" +max);
        } 
    }
}
