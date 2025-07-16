import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,4,6,3};
        Arrays.sort(arr);  //1,2,3,4,6,7,8,8,9
        int temp[]=new int[arr.length];
        int tempCount=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                temp[tempCount]=arr[i];
                tempCount++;
            }
            
        }
        for(int i=0;i<tempCount;i++){
            System.out.println(temp[i]+" ");
                
        }
    }
    
}
