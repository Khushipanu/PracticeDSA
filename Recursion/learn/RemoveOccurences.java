public class RemoveOccurences {
    public static String removeoccurences(String str,int idx){
        if(idx==str.length()){
            return " ";
        }
        char ch=str.charAt(idx);
        if(ch=='a'){
            return removeoccurences(str, idx+1);
        }
        else{
            return ch+ removeoccurences(str, idx+1);
        }

    }
    public static void main(String args[]){
        String str="abcax";
        String ans=removeoccurences(str, 0);
        System.out.println(ans);

    }
    
}
