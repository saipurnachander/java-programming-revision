package Array_lists;
// add()-----> adding elements
// get()-----> accessing elements
// set()-----> changing item at an index
// remove()--> two methods (by index, by value )
// size() ---> returns the length of list
// sort() ----> sorting elements in the list 
// import java.util.Arrays;
import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.Collections;

public class Basic_arraylists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // add() method :
        fruits.add("orange");
        numbers.add(1);
        fruits.add("Apple");
        numbers.add(2);
        fruits.add("Banana");
        numbers.add(3);

        // set() method ---> changing the item

        fruits.set(0,"avacado");
        numbers.set(1, 1); 

        // remove() method ---> removing item from list

        fruits.remove("Banana");

        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println(numbers.size());

        // get() method -----> accessing the item i the list
        System.out.println(fruits.get(0));
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
