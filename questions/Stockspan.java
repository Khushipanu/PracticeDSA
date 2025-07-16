public class Stockspan {
    public static void stock(int arr[]){
        int n=arr.length;
        int span[]=new int[n];
        span[0]=1;
        for(int i=1;i<n;i++){
            int prev=i-1;

            while(prev>=0 && arr[prev]<arr[i]){
                prev--;
            }
            span[i]=i-prev;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(span[i]);
        }

    }
    public static void main(String args[]){
        int arr[]={100,60,70,65,80,85};
        stock(arr);

        
    }

    
}
