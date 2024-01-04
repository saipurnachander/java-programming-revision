package Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        String name = "sai purna chander reddy";
        StringBuffer n = new StringBuffer(name);
        n.append(",karra");
        name = new String(n);
        System.out.println(name);

        n.replace(3,4,",karra");
        name = new String(n);
        System.out.println(name);

        String name1 = "sai purna chander reddy";
        StringBuffer n1 = new StringBuffer(name1);
        n1.insert(3, "sai");
        name1 = new String(n1);
        System.out.println(name1);

        n1.delete(3, 6);
        name1 = new String(n1);
        System.out.println(name1);

        n1.reverse();
        System.out.println(n1);
        name1 = new String(n1);
        System.out.println(name1);
    }
}
