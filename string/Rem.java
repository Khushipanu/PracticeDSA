public class Rem {
    public static String rev(String str,int idx){
        if(idx==str.length()){
            return "" ;
        }
        char curr=str.charAt(idx);
        if(curr=='a'){
            return rev(str,idx+1);
        }else{
            return curr+ rev(str,idx+1);
        }
    }
    public static void main(String args[]){
        String str="abcax";
        System.out.println(rev(str,0));

    }
    
}
