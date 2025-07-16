
public class TrappingRain {  
    //o(n)
    public static int trapwater(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        int waterStored=0;

        leftMax[0]=arr[0];
        rightMax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
            
        }
        for(int i=1;i<n-1;i++){
            int minlevel=Math.min(rightMax[i],leftMax[i]);
            waterStored+=(minlevel-arr[i]);
            
        }
        return waterStored;
    } 
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trapwater(arr));
    }
    
}
