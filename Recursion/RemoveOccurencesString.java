public class RemoveOccurencesString {
    //s+= is(since it is immutable isliye typical hojaega bhut isliye without new string kro)
    // public static String removeOccurences(String str,String s,int idx){
    //     if(idx==str.length()){
    //         return s;
    //     }
    //     if(str.charAt(idx)!='a'){
    //         s+=str.charAt(idx);
    //     }
    //    return removeOccurences(str, s, idx+1);

    // }

    public static String removeOccurence(String str,int idx){
        if(idx>=str.length()){
            return " ";
        }
        if(str.charAt(idx)!='a'){
            return str.charAt(idx) + removeOccurence(str,idx+1);

        }  
        else{
            return removeOccurence(str,idx+1);
        }
    }
    public static String removeOccurenceSecond(String str){
        if(str.length()==0){
            return " ";
        }
        String smallAns=removeOccurenceSecond(str.substring(1));
        if(str.charAt(0)!='a'){
           return str.charAt(0) + smallAns;

        }
        else{
           return smallAns;
        }
       
    }
   public static void main(String[] args) {
    String str="saas";
    String ans=removeOccurenceSecond(str);
    System.out.println(ans);
   }
    
    
}
