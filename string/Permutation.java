public class Permutation{
    public static void findPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewStr=str.substring(0,i) + str.substring(i+1);     //0 to 0  means empty string
            findPermutation(NewStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str," ");
    }

}