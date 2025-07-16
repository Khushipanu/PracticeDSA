import java.util.*;
public class transpose {
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int trans[][]=new int[3][3];
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[i].length;j++){
                trans[i][j]=mat[j][i];
            }
        }
           
        System.out.println("printing transpose");
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[i].length;j++){
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
