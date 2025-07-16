public class Palindrome {
    public static boolean fun(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l)==str.charAt(r)){
            fun(str,l+1,r-1);
        }else{
            return false;
        }
        return true;
        
    }
    public static void main(String args[]){
        String str="abba";
        System.out.println(fun(str,0,str.length()-1));
    }
    
}
