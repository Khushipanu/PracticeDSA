import java.util.*;
public class Complete{
    public static class linklist{
        public static class Node{
            int data;
            Node next;
            Node (int data){
                this.data=data;

            }
        }
        public static Node head=null;
        public static Node tail=null;
        
        public static void addAtfirst(int data){ //adding
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }
        public static void addAtlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return ;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static void addAtCertain(int idx,int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;

        }
        public static int deletefirst(){
            if(head==null){
                System.out.println("nothing here bye bye!!");
                return 0;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        public static void delAtLast(){
            if(head==null){
                System.out.println("nothing here to be printed");
                return;
            }
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
        }
        public static void delAtCertain(int idx){
            if(head==null){
                System.out.println("noting to be deleted");
                return;
            }
            int i=0;
            Node temp=head;
            while(i<idx-1){
                i++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
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
        ll.addAtfirst(3);
        ll.addAtfirst(4);
        ll.addAtfirst(1);
        ll.addAtfirst(2);
        ll.addAtCertain(2,88);
        ll.deletefirst();
        ll.delAtLast();
        ll.display();
        ll.delAtCertain(2);
        ll.display();
    }
}