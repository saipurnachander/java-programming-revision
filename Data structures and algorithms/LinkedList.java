// package Data structures and algorithms;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    int size;
    LinkedList(){
        this.head=null;
        this.tail=null;
        this.size = 0;
    }
    public boolean isempty(){
        return this.size == 0;
    }
// inserting elements
// inserting infront of list
    public void insert_in_begning(int val){
        Node new_node = new Node(val);
        // new_node.data = val;
        if (this.isempty()){
            this.head = new_node;
            this.tail = new_node;
        }
        else {
            new_node.next = this.head;
            this.head = new_node; 
        }
        this.size = this.size+1;
    }
// inserting at the end of the list
    public void insert_at_end(int val){
        Node new_node = new Node(val);
        // new_node.data = val;
        if (this.isempty()){
            this.head = new_node;
            this.tail = new_node;
        }
        else {
            this.tail.next = new_node;
            this.tail = this.tail.next; 
        }
        this.size = this.size+1;
    }
// inserting in between the list
    public void insert_between_list(int val,int index){
        Node new_node = new Node(val);
        // new_node.data = val;
        if (isempty()){
            this.head = new_node;
            this.tail = new_node;
        }
        if (index != 0 || index != this.size -1  ){
            int t = 0;
            Node temp = this.head;
            while (t != index){
                Node t1;
                if (t+1 == index){
                    t1=temp.next;
                    temp.next = new_node;
                    new_node.next = t1;
                }
                temp=temp.next; 
                t = t + 1;
            }
        }
        if (index == 0 ){
            new_node.next = this.head;
            this.head = new_node; 
        }
        if(index == this.size - 1){
            this.tail.next = new_node;
            this.tail = this.tail.next;
        }
        this.size = this.size + 1;
    }
// deleting the elements
// delete at end 
    public void delete_at_end(){
        Node temp = this.head;
        while (temp != null){
            if(temp.next == this.tail ){
                this.tail=temp;
                this.tail.next=null;
            }
            temp = temp.next;
        }
        this.size = this.size -1;
    }
// delete in the begning
    public void delete_in_begning(){
        Node temp = this.head.next;
        this.head = temp;
    }
// deleting in between 
    public void delete_in_between(int index){
        if (index == 0 ){
            Node temp = this.head.next;
            this.head = temp;
        }
        if (index == (this.size -1)){
            Node temp = this.head;
            while (temp != null){
                if(temp.next == this.tail ){
                    this.tail=temp;
                    this.tail.next=null;
                }
                temp = temp.next;
        }
        }
        else {
            int t = 0;
            Node temp = this.head;
            while (t != index){
                if (t+1 == index){
                    temp.next = temp.next.next;;
                }
                temp=temp.next; 
                t = t + 1;
            }
        }
    }
// searching elements
    public int search(int val){
        return 2;
    }
// displaying inserted items
    public void display(){
        Node temp;
        temp = this.head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
public static void main(String[] args){
    LinkedList obj = new LinkedList();
    obj.insert_at_end(21);
    obj.insert_at_end(22);
    obj.insert_at_end(23);
    obj.insert_at_end(24);
    obj.insert_in_begning(20);
    obj.insert_between_list(456, 3);
    obj.display();
    obj.delete_in_begning();
    System.out.println('\n');
    obj.display();
    System.out.println('\n');
    System.out.println(obj.head.data);
    obj.delete_in_between(1);
    obj.display();
} 
}
// class Main{
//     public static void main(String[] args){
//         LinkedList obj = new LinkedList();
//         obj.insert_at_end(21);
//         obj.insert_at_end(22);
//         obj.insert_at_end(23);
//         obj.insert_at_end(24);
//         obj.insert_in_begning(20);
//         obj.insert_between_list(456, 3);
//         obj.display();
//         obj.delete_in_begning();
//         System.out.println('\n');
//         obj.display();
//         System.out.println('\n');
//         System.out.println(obj.head.data);
//         obj.delete_in_between(1);
//         obj.display();
//     } 
// }