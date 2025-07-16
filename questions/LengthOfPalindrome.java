public class LengthOfPalindrome{
    public static boolean isPalindrome(String str,int i,int j){
        
         while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
         }
         return true;  
}   
 public static void main(String[] args) {
        String str="adeedaad";
        int len=0;
        int Max_l=1;
       for(int i=0;i<str.length();i++){
        for(int j=i;j<str.length();j++){
            if(isPalindrome(str,i,j)){
              len=j-i+1;
                 Max_l=Math.max(Max_l,len);
            }
           
        }
       }
       System.out.println(Max_l);
    }

}

