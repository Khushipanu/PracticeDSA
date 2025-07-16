public class Reverse {
    public static class linklist{
         public static class Node{
            int data;
            Node next=null;
            Node (int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head=null;
        public static Node tail=null;
        
        public static void reverse(){
              Node curr=tail=head;
              Node prev=null;
              Node next;
              while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
              }
              head=prev;
        }
        public static void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        
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
            linklist.display();
            linklist.reverse();
            System.out.println();
            linklist.display();    

        
    }
    
}
