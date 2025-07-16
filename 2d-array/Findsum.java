public class Findsum {
    public static void findprefixsum(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;
        //traverse to calculate prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
                  }
        }
    }
    public static int findsum(int [][]arr,int r1,int c1,int r2,int c2){
        int sum=0;
        findprefixsum(arr);
        for(int i=r1;i<=r2;i++){
            //r1 to r2 sum for row i
            if(r1>=1)
            sum+=arr[i][c2] - arr[i][c1-1];
            else sum+=arr[i][c2];
        }
        return sum;
    }

    public static void main(String args[]){
        int arr[][]={
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1}
        };
        System.out.println(findsum(arr,1,1,3,2));
        
    }
    
}
