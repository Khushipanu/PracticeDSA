import java.util.*;
public class AddLinklist{
    public static class  linklist{
         public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        public  Node head=null;
        public  Node tail=null;
        public  static void display(Node node){
          
            while(node!=null){
                System.out.println(node.data);
                node=node.next;
            }
            System.out.println();
        }
        
    public  void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
   
    public static Node addTwonums(Node l1,Node l2){
        Node dummyHead=new Node(-1);
        Node temp1=l1;
        Node temp2=l2;
        Node curr=dummyHead;
        int carry=0;
        while(temp1!=null || temp2!=null || carry!=0 ){
            int sum=carry;
            if(temp1!=null){
                sum+=temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }
            Node newnode=new Node(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=curr.next;

        }
        return dummyHead.next;

    }
    }     
    public static void main(String args[]){
        linklist l1=new linklist();
        l1.addFirst(7);
        l1.addFirst(3);
        l1.addFirst(2);
        linklist l2 =new linklist();
        l2.addFirst(5);
        l2.addFirst(4);
        l2.addFirst(5);

        linklist.Node result =linklist.addTwonums(l1.head, l2.head);
        System.out.print("Result: ");
        linklist.display(result);
    }
}
