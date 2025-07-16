public class Reverse {
    public static String reverse(String str){
        if(str.length()==0){
            return " ";
        }
       String ans=reverse(str.substring(1));
       char curr=str.charAt(0);  //i
       return ans +curr; //" " + i

    }
    public static void main(String args[]){
        String str="Khushi";
        String a=reverse(str);
        System.out.println(a);
    }
    
}
