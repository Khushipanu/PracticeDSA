public class StringNumbers {
    public static void printStr(String str){

        String ans=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
           
            char ch=str.charAt(i); 
            char prev=str.charAt(i-1);
            if(ch==prev){
                count++;
            }
            else{
                ans+=count;
                count=1;
                ans+=ch;
            }
        }
        if(count>=1){
            ans+=count;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        String str="aaabbccd";
        printStr(str);
    }
    
}
