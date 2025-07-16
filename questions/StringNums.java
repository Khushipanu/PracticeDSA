public class StringNums {
    public static void numString(String str){
        int n=str.length();
        String res="" +str.charAt(0);
        int count=1;
        for(int i=1;i<n;i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                res+=count;
                count=1;
                res+=curr;
            }
          
        }
        if(count>=1){  //for last wala case
            res+=count;
        }
        System.out.println(res);
       
    }

    public static void main(String args[]){
        String str="aaabbccdd";
        numString(str);
    }
    
}
