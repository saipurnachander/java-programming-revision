package Arrays;
import java.util.Arrays;
class Arr{
    public int sum(int... Numbers){
        int sum = 0 ;
        for( int i : Numbers){
            sum = sum + i ;
        }
        return sum;
    }
    public String conct (String ... Words){
        String ct = null;
        for (String i : Words){
            if (ct == null){ct = i;}
            else {ct = ct + i;}}
        return ct;}
    public String conct_2 (String ... Words){
        return Arrays.toString (Words);}
}
public class Variable_length_arguments_list {
    public static void main(String[] args) {
        Arr obj_1 = new Arr();
        System.out.println("sum of numbers : "+obj_1.sum(1,2,3,4));
        System.out.println("concatenated string :"+obj_1.conct(" sai"," purna"," chander"," Reddy"));
        System.out.println("concatenated array string :"+obj_1.conct_2(" sai"," purna"," chander"," Reddy"));
    }
}