public class ReverseP {
    public static String printR(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns=printR(str.substring(1));
        char curr=str.charAt(0);
        return smallAns+curr;


    }
   public static void main(String[] args) {
    String str="accca";
    String rev=printR(str);
    if(str.equals(rev)){
        System.out.println("yes equal");
    }
    else{
        System.out.println("not ");
    }
   }
}
