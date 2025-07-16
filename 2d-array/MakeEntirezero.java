public class MakeEntirezero {
    public static int[][] makezeroes(int arr[][]){
        int n =arr.length;
        int m=arr[0].length;
        int row[]=new int[m];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;

                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==-1 || col[j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
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
        int[][] ans= makezeroes(arr);
        display(ans);
    }
    
}
