package Arrays;
public class First {
    public static void main(String[] args) {
        int[] list1 = {12,32,34,45};
        int [] list2 = new int[5]; 
        for (int i = 0 ; i< list1.length; i++){
            System.out.println(list1[i]);
        }
        System.out.println("next array : list 2");
        for(int i = 0 ; i< 5 ; i++ ){
            list2[i] = i;
            System.out.println(i);
        }
        
    }
}
