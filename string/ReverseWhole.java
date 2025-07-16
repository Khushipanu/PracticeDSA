public class ReverseWhole {
    public static String reverse(String str){     
        int n=str.length()-1;
        String s="";
        for(int i=n;i>=0;i--){
            s+=str.charAt(i);     
        }
        return s;
    }
    public static String reverseT(String str){
        String word="";
        String res="";
       
         String rs= reverse(str); //nep eht

         for(int i=0;i<rs.length();i++){

            if(rs.charAt(i)!=' '){   //no space
               word+=rs.charAt(i);
            } 
       
            else{              
                res+=reverse(word) +" ";
                word="";
            }
         }
         if(word.length()!=0){
          
            res+=reverse(word);

         }
         return res;
    }
    public static void main(String[] args) {
        String str="the pen";
        System.out.print(reverseT(str));
    }
    
}
