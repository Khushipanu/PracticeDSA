public class ReverseEachW {
    public static void main(String[] args){
        String str="my name is khushi";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;  //ym
                ans+=" ";  //ym_(space)
                sb=new StringBuilder(""); //ab sb khali hogya

            }

        }
        sb.reverse(); //for last)
        ans+=sb;
        System.out.println(ans);
    }
    
}
