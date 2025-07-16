import java.util.*;
public class FindSubsequences {
    public static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        char curr=str.charAt(0);
        ArrayList<String> smallAns=getSSQ(str.substring(1));  //bc
        for(String ss:smallAns){  //ss variable banaya aur ab iterate krre hai in samlllans
            ans.add(ss);  //single element
            ans.add(curr + ss);

        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=getSSQ(str);
       for(String ss: ans){
        System.out.println(ss);
       }
        
    }

    
}
