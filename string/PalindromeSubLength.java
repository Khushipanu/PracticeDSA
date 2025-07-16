public class PalindromeSubLength {
    public static boolean isPalindrome(String str,int l,int r){
  
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;            
            }
        l++;
        r--;      
        }
        return true;
      
    }
    public static void main(String args[]){
        String str="adeedaaad";
        int len=0;
        int max=1;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isPalindrome(str,i,j)){
                    len=j-i+1;
                    max=Math.max(len,max);
                }
            }

        }
        System.out.println(max);

    }

    
}
