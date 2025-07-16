import java.util.*;//nhi hora bhai
public class Oddsum {
    static int count=0;
  
    public static void sumP(int arr[],int idx,int sum){
          
        if(idx==arr.length-1){
            if(sum%2!=0){
                count++;

            }
            return ;
        }
        sum=sum+arr[idx];
        sumP(arr,idx+1,sum);
        sum-=arr[idx];
        sumP(arr,idx+1,sum);
        System.out.println(count);
      

    }
    public static void main(String args[]){
         int arr[]={1,2,3};
        sumP(arr,0,0);

    }
    
    
}
