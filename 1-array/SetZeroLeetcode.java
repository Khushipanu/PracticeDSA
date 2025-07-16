public class SetZeroLeetcode {
    public static void changeMatrix(int arr[][],int n,int m){
        int []arr_row=new int[n];
        int []arr_col=new int[m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr_row[i]=1;
                    arr_col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            if(arr_row[i]==1 || arr_col[j]==1){
                arr[i][j]=0;

            }
           }
        }
    }
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int n=arr.length;
        int m=arr[0].length;
        changeMatrix(arr,3,3);
        printArray(arr);
    }
    
}
