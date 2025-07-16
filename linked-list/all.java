import java.util.*;
public class all{
    public static class linklist{ 

    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;

    public static void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void addAt(int data,int idx){
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        if(idx==0){  
            addFirst(data);
            return;
        }
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
       

    }
    public static void adEnd(int data){
        Node newnode=new Node(data);
        
        if(head==null){
            head=tail=newnode;
            return;
        }
     
            tail.next=newnode;
            tail=newnode;

    }
    public static int removeFirst(){
        if(head==null){
            System.out.println("doesnt exist");
            return 0;
        }
        if(head.next==null){
            int data=head.data;
            head=tail=null;
            return data;
        }
        int data=head.data;
        head=head.next;
        return data;
    }
    public static int removeLast(){
        if(head==null){
            System.out.println("cant be deleted");
            return 0;
        }
        if(head.next==null){
            int data=head.data;
            head.next=null;
            return data;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        int data=temp.next.data;
        temp.next=null;
        return data;
    }
    public static int removeAt(int idx){
       Node temp=head;
       int i=0;
       while(i<idx-1){
        temp=temp.next;
        i++;
       }
       int data=temp.next.data;
       temp.next=temp.next.next;
       return data;

    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}  
  public static void main(String args[]){
        linklist ll=new linklist();
        ll.addFirst(33);
        ll.addFirst(23);
        ll.addFirst(22);
        ll.adEnd(55);
        ll.addAt(1,0);
        // ll.removeFirst();
        // ll.removeLast();
        ll.display();
        ll.removeAt(2);
        ll.display();
    }
}