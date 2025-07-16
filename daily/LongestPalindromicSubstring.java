public class LongestPalindromicSubstring {
    public static boolean palindrome(String str,int i,int j){
        while(i<=j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
        return true;

    }
    public static void longestpalindromesubstring(String str){
        int len=0;
        String ans="";
        int max=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(palindrome(str,i,j)){
                    len=j-i+1;
                    if(len>max){
                        max=len;
                        ans=str.substring(i,j+1);
                    }
                   
                }
            }
        }
        System.out.println(ans);

    }
    public static void main(String args[]){
        String str="aabaacccaaab";
        longestpalindromesubstring(str);

    }
    
    
}
