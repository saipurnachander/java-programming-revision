package Arrays;

public class Arrays_excersize_2 {
    static int product(int... numbers){
        int pr = 1;
        for(int i : numbers){
            pr = pr * i;
        }
        return pr;
    }    
    static int sum(int... numbers){
        int sum = 0;
        for(int i : numbers){
            sum = sum + i;
        }
        return sum;
    }  
    public static void main(String[] args) {
        System.out.println(" product of numbers : "+Arrays_excersize_2.product(1,2,3,4,5));
        System.out.println(" sum of numbers : "+Arrays_excersize_2.sum(1,2,3,4,5));
    }
}
