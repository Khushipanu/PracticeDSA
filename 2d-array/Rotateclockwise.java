public class Rotateclockwise{
    public static int[][] rotate(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int mat[][]=new int[n][m];
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                mat[j][n-i-1]=arr[i][j];
            }
        }
        return mat;
    }
    public static int[][] rotateanti(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int mat[][]=new int[n][m];
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                mat[n-j-1][i]=arr[i][j];
            }
        }
        return mat;
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
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        display(arr);
        System.out.println("new is");
        int ans[][]=rotate(arr);
        display(ans);
        System.out.println("anti clockwise ");
        int secAns[][]=rotateanti(arr);
        display(secAns);
    }
}