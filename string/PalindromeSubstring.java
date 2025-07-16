public class PalindromeSubstring {
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
    public static void main(String args[]){
        String str="abaabcooc";
        int count=0;
      
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isPalindrome(str,i,j)){
                    System.out.println(str.substring(i,j+1));
                 
                    count++;       
                }
            }
            
        }
        System.out.println(count);

    }
    
}
