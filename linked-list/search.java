import java.util.*;
public class search {

    public static class linklist{  
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        public static Node head=null;
        public static Node tail=null;
        public static int search(int target){
            Node temp=head;
            while(temp.next!=null){
                if(temp.data==target){
                    System.out.println("yippy!! found");
                    return temp.data;
                }
                temp=temp.next;
            }
            return -1;

        }
    }
    public static void main(String args[]){
        linklist.Node a =new linklist.Node(3);
        linklist.Node b =new linklist.Node(4);
        linklist.Node c =new linklist.Node(5);
        a.next=b;
        b.next=c;
        linklist.head = a;
        linklist.tail = c;
        System.out.println(linklist.search(3));

      

    }
  

}