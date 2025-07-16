import java.util.*;

public class Basic {

    public static  class LinkedList{
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

        public static int size;
        public void addFirst(int data){
        size++;
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;
       

    }
   public static void display() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data);
        temp = temp.next;
    }
    System.out.println();
 }    
 public static int searching(int target){
    int i=0;
    Node temp=head;
    while(temp!=null){
        if(temp.data==target){
            return i;
        }
        temp=temp.next;
        i++;

    }
    return -1;

 }

 public static void addLast(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
    
 }

   public static void addAtIdx(int data,int idx){
    size++;
    Node newnode=new Node(data);
    if(head==null){
        head=tail=newnode;
        return ;
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

   public static int removeFirst(){
   
    if(head==null){
        return 0;
    }
     int val=head.data;
    head=head.next;
    return val;  //not so imp
   }
   public static int removeLast(){
      if(head==null){
        return 0;
      }
      else if(head==tail){
        return 0 ;
      }
     Node temp=head;
     int i=0;
     while(i<size-2){
        temp=temp.next;
        i++;
     }
     int data=temp.next.data;
     temp.next=null;
     tail=temp;
     size--;
     return data;
   }
   public static Node addOne(Node head){
    head=reverse(head);
        int carry=1;
        Node temp=head;
        while(temp!=null){
            temp.data=temp.data + carry;
            if(temp.data<9){
                carry=0;
                break;
            }else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1){
            Node newnode=new Node(carry);
            head=reverse(head);
            newnode.next=head;
            return newnode;
            
        }
        head=reverse(head);
        return head;
   }

   public static int search(int target){
    Node temp=head;
    int i=0;
    while(temp!=null){
      if(temp.data==target){
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
   }
   public static int searchRec(int target,Node temp,int i){

    if(temp==null){
        return -1;
    }
    if(temp.data==target){
        return i;
    }
   return searchRec(target,temp.next,i+1);
    
   }

    public static int middle(){
        Node temp=head;
        int n=size;
        int times=0;
              if(n % 2 == 0){  // even
               times = n / 2;
                        } else {         // odd
               times = (int) Math.floor((double)n / 2); // or just n / 2
                   }
    
        // while(temp!=null){
        //     if(i==times){
        //         System.out.println(temp.data);
        //         return i;
        //     }
        //     temp=temp.next;
        //     i++;

        // }
        while(times>0){
            temp=temp.next;
            times--;

        }
        return temp.data;
    }
    public static Node middleActual(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static int length(){
        Node temp=head;
        int i=0;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }
    public static void removeNfromEnd(int n){
        if(size==n){
            head=head.next;
            return;
        }
        int i=0;
        Node temp=head;
        while(i<size-n-1){
            temp=temp.next;
            i++;
        }
        
   
        temp.next=temp.next.next;
     


    }
    public static Node reverse(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
      temp=head;
      int i=arr.size()-1;
      while(temp!=null){
        temp.data=arr.get(i);
        i--;
        temp=temp.next;
      }
      return head;
        
    }
    public static boolean checkPalindrome(){

        if(head==null || head.next==null){
            return true;
        }
        //step1 find mid
        Node midNode=middleActual();
        //step2 reverse sec half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;
        //step3 left hald and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }



    }
  
     
     public static void main(String args[]){
           LinkedList ll=new LinkedList();
           ll.addFirst(9);
           ll.addFirst(9);
           ll.addLast(9);
           ll.addLast(9);
        //    ll.addAtIdx(9,1);
        //    ll.display();
        //    System.out.println(ll.size);
        //    System.out.println(ll.search(10));
        //    System.out.println(ll.searching(10));
        //    System.out.println();
        //    ll.removeLast();
        //    ll.display();
        //   System.out.println( ll.searchRec(5, ll.head, 0));
           System.out.println( ll.middleActual().data);
           ll.display();
           System.out.println(ll.length());
           System.out.println("**********************");
        //    ll.removeNfromEnd(4);
        //    ll.display();
        //    System.out.println(ll.checkPalindrome());
        ll.head=ll.addOne(ll.head);
        ll.display();

           


        }
    
}
