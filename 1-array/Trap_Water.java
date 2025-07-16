public class Trap_Water{
    public static int trapwater(int arr[]){
        int n=arr.length;
        int waterTrapped=0;
        int x=0;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
       int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }

        for(int i=0;i<n;i++){
            x=Math.min(rightMax[i],leftMax[i]);
             waterTrapped+=(x-arr[i]);

        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int arr[]={8,5,10,4,2,6,9};
        System.out.println(trapwater(arr));

    }
    
}