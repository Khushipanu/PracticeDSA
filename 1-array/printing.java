import java.util.*;
public class printing{
    public static void printingg(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j] +"");
            }
        }
            

    }
    public static void main(String[] args) {
       
        // int [][]arr=new int[2][3];
        int [][]arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}                  
                     };
                     printingg(arr);

        
    }
}