import java.util.*;
//transpose without extra space
public class Transpose2 {
    public static void findTranspose(int[][] matrix,int r,int c){
      for(int i=0;i<c;i++){
        for(int j=i;j<r;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }
    }
    public static void reverseArray(int [] arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[][] matrix,int n){
        findTranspose(matrix,n,n);
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }

      }
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.print("enter values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // findTranspose(matrix,r,c);
        // printMatrix(matrix);
        rotate(matrix,r);
        printMatrix(matrix);
    } 
}
