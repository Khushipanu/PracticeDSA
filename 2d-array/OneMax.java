public class OneMax{
    //    public static int rowWithMax1s(int[][] mat) {
    //     int n=mat.length;
    //     int max=0;
    //     int count=0;
    //     int ans=Integer.MAX_VALUE;
    //     int m=mat[0].length;
    //     for(int i=0;i<n;i++){
    //          count=0;
    //         for(int j=0;j<n;j++){
    //             if(mat[i][j]==1){
    //                 count++;
    //             }
    //         }
    //         if(count>max){
    //             max=count;//3
    //             ans=i;//0
    //         }
           
    //     }
        
    //   if(count>0){
    //     return ans;
    //   }
    //   return -1;
       
    // }
        public static int lowerBound(int[] arr, int x) {
         int n=arr.length;
        int l=0;
        int h=n-1;
        int ans=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=x){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
            
        }
        return ans;
       
     }
    public static int rowWithMax1s(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        int countmax=0;
        int idx=-1;
        for(int i=0;i<m;i++){ 
            int countones=n -lowerBound(mat[i],1);
            if(countones>countmax){
                countmax=countones;
                idx=i;
            }

    }
        return idx;
    }
    public static void main(String args[]){
        int mat[][]={
            {1,0,1},
            {1,0,1},
            {1,1,1}
        };
        System.out.print(rowWithMax1s(mat));
    }
}