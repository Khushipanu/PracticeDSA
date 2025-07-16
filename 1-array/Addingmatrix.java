import java.util.*;
public class Addingmatrix {

    public static void printing(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }

    }


    
    public static void sum(int arr1[][],int arr2[][],int r,int c){
        int [][] sum=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=arr1[i][j] + arr2[i][j];
            }
           
        }
        printing(sum);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();
        int [][] arr1=new int[r][c];
        System.out.print("pls enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int [][] arr2=new int[r][c];
        System.out.print("enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sum(arr1,arr2,r,c);
        


        
    }
    
}
