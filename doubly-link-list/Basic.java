import java.util.*;
public class Basic {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
        
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static Node insertAtHead(Node head,int val){
        Node newnode=new Node(val);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return head;
    }
     public static void insertAtLast(Node head,int val){
        Node newnode=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=null;
       
    }
    public static Node deleteHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    public static void displayReverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.prev;
        }


    }
    public static void main(String args[]){
        //4 10 2 99 13
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // display(a);
        // displayReverse(e);
        System.out.println("new");
        Node newNode=insertAtHead(a,35);
        // display(a);
        insertAtLast(a, 55);
        display(newNode);
        Node n=deleteHead(newNode);
        System.out.println("hi im new");
        display(n);

      
        


    }
    
}
