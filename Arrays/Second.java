package Arrays;
//  arrays in functions 
public class Second {
    public static void main(String[] args) {   
        int[] a = {1,2,3,4};
        change(a);
        System.out.println("array a:");
        for (int i = 0 ; i< 4;i++){
            System.out.println(a[i]);
        }

        int[] b = get_numbers();
        System.out.println("array b:");
        for (int i = 0 ;  i< b.length;i++){
            System.out.println(b[i]);
        }
    }
    public static void change(int[] arr){
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
    }
    public static int[] get_numbers(){
        return new int[] {3,4,5,6,7};
    }
}
