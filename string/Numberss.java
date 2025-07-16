public class Numberss {
    public static String stringnums(String str){
        String res=""+ str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                res+=count;
                res+=curr;
                count=1;
            }
            
        }
        res+=count;
        return res;
    }
    public static void main(String args[]){
        String str="aaabbcc";
        System.out.println(stringnums(str));
    }
    
}
