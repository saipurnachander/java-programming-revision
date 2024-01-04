package Strings;
import java.util.StringTokenizer;

// import java.util.StringTokenizer;

// import java.util.StringTokenizer;

public class String_tokenizer {
    public static void main(String[] args) {
        String name = "sai purna chander reddy, karra";
        String email = "saipurna@colostae.edu";
        StringTokenizer nt = new StringTokenizer(name);
        StringTokenizer mt = new StringTokenizer(email,"@");

        System.out.println(nt.nextToken(" "));
        
        

        while (nt.hasMoreTokens()){
            System.out.println(nt.nextToken());
        }
        while (mt.hasMoreTokens()){
            System.out.println(mt.nextToken());
        }


    }
}
