import java.util.*;

public class CountNegative {
   
        public static void printnegative(int arr[],int k){
            int n=arr.length;
          
            int temp=0;
            int count=0;
            for(int i=0;i<=(n-k);i++){
                
                for(int j=i;j<i+k;j++){
                    if(arr[j]<0){
                       count++;
                        break;
                    }
                }
                
            }
           System.out.println("count is:" +count);
        }
        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        public static void main(String args[]){
            int arr[]={-8,2,3,-6,10};
           printnegative(arr, 2);
        }
        
    }
    
    

