import java.util.*;
public class SpiralMatrix{
    public static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
    

        }
    }
    public static void spiralMatrix(int arr[][],int r,int c){
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int totalElements=0;
        while(totalElements< r*c ){
            //top row -> leftcol to rightcol 
            for(int j=leftCol;j<=rightCol;j++){
                System.out.print(arr[topRow][j] + " ");       //0,1  0,2  0,3
                totalElements++;
            }
            topRow++;

            //right row -> bottom row
            for(int i=topRow;i<=bottomRow;i++){
                System.out.print(arr[i][rightCol]+ " ");
                totalElements++;
            }
            rightCol--;
           

            //bottom col-> left col
            for(int j=rightCol;j>=leftCol;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
          
            //bottomRow to toprow
            for(int i=bottomRow;i>=topRow;i--){
                System.out.print(arr[i][leftCol] +" ");
                totalElements++;
            }
            leftCol++;
        }

    }

    public static void main(String args[]){
        int matrix[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int r=3;
        int c=3;
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number of rows and columns ");
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // int [][]matrix=new int[r][c];
        // System.out.println("enter values");
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
           
        // }
        spiralMatrix(matrix,r,c);
       
    }
}
