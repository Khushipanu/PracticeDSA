public class Tcs {
    public static void main(String args[]){
        String str="###*";
        int count1=0;  // *
        int count2=0;  // #
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='#') count1++;  //3
            else count2++;    //1

        }  ///# > 
        if(count1>count2){
            System.out.println(count2-count1);
        }else if(count2>count1){
            System.out.println(count2-count1);

        }else{
            System.out.println(0);
        }
    }
    
}
