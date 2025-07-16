public class ToggleUsingString {
    public static void main(String args[]){
        String str="Physics";
        
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            char ch=str.charAt(i);
            int ascii=(int)ch;

            if(ascii>97){
                flag=false;
            }

            if(flag){
                ascii+=32;
                char rechar=(char) ascii;
                str=str.substring(0,i) + rechar + str.substring(i+1);
            }
            else{
                ascii-=32;
                char rechar=(char) ascii;
                str=str.substring(0,i) + rechar + str.substring(i+1);
                
            }
        }
        System.out.println(str);
    }

    
}
