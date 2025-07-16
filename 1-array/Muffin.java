import java.util.*;
public class Muffin {
    public static void muffins(int rupee[]){
        int n=rupee.length;
        int count_five=0,count_ten=0;
        boolean mark=true;
        for(int i=0;i<n;i++){
            if(rupee[i]==5){
                count_five++;
            }
            else if(rupee[i]==10){
                if(count_five>=1){
                    count_five--;
                    count_ten++;
                }
                else {
                    mark=false;
                    System.out.println("no"); 
                    break;  
                }
            }
            else if(rupee[i]==20){
                  if(count_five>=1 && count_ten>=1 ){
                    count_ten--;
                    count_five--;
                  }
                 else if(count_five>=3){
                    count_five-=3;
                }
                else{
                    mark=false;
                    System.out.println("no");
                    break;
                }
            }

        }
        if(mark){
            System.out.println("yes");
        }
        else{
            System.out.println("sorry");
        }

       
    }
    public static void main(String args[]){
        int rupee[]={5,5,5,20,20};
        muffins(rupee);

    }
    
}
