import java.util.*;
public class ArrayImplementationOfCircularQ{
    //imp for interview
    public static class Cqa{
        int f=-1;
        int r=-1;
        int size=0;
        int []arr=new int[8];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full!");
            }
           
          else if(size==0){
                f=r=0;
                arr[0]=val;
            }
            else if(r<arr.length-1){  //normal case
                arr[++r]=val;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=val;
            } 
            size++;
        }
        public int remove() throws Exception{
            size--;
            if(size==0){
                throw new Exception("queue is empty");
            }else{
                int val=arr[f];
                if(f==arr.length-1){
                    f=0;

                }
                return val;
            }
            
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!");
            }
            else return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            else{
                for(int i=f;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) throws Exception {
        Cqa q=new Cqa();
        q.add(4);
        q.add(5);
        q.display();
        

         
    }
    
}