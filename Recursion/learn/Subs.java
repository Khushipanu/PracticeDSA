public class Subs {
    public static void subsequences(String str,String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=str.charAt(0);
        String remString=str.substring(1);
        subsequences(remString,currAns); //" "
        subsequences(remString,curr+currAns);  //c " "

    }
    public static void main(String args[]){
        String str="abc";
        subsequences(str, " ");

    }
    
}
