public class Toggle {
    public static void toggle(String str){
        for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             int ascii=(int)ch;
             if(ascii>=90 && ascii<=122){  //small
                ascii-=32;
             }
             else{
                ascii+=32;
             }
             char rechar=(char)ascii;  //A
             str=str.substring(0,i) +rechar + str.substring(i+1);
            
        }
        System.out.println(str);
    }
    public static void main(String args[]){
        String str="kHushI";
        toggle(str);
    }
    
}
