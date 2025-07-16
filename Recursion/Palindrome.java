public class Palindrome {
    public static boolean checkP(String str,int l,int r){
        if(l>r){
            return true;
        }
        if(str.charAt(l)==str.charAt(r)){
          return checkP(str,l+1,r-1);
            
        }
       else{
        return false;
       }
        


    }
    public static void main(String args[]){
        String str="deed";
        if(checkP(str,0,str.length()-1)){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
       
    
  }
}
