public class Compressed {
    public static void compress(String str){
        String ans=" "+str.charAt(0);   //a
        int count=1;
        for(int i=1;i<str.length();i++){

            char ch=str.charAt(i);
            if(ch==str.charAt(i-1)){
                count++;
            }
            else{
                ans+=count;
                count=1;
                ans+=ch;
            }
            
        }
        if(count>1)
        ans+=count;
        System.out.println(ans);
    }
    public static void main(String args[]){
        String str="aaabbbccdddee";
        compress(str);

    }
    
}
