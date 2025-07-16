public class SubstringPrint {
    public static void printSubstring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String s=str.substring(i,j+1);
                System.out.println(s);               
            }
            
        }
    }
    public static void main(String args[]){
        String str="abcd";
        printSubstring(str);

    }
    
}
