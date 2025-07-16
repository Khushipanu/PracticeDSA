

public class ReverseWord {
    public static String reverseWords(String s) {
        String word="";
        String finalAns="";
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){  //word
                word+=ch;
            }else{  //space hai
            int count=0;
               while(i>=0 &&ch==' '){
                count++;
               }
               for(int j=0;j<count-1;j++){
                ch++;
               }
               finalAns+=reverse(word)+" ";
               word="";

            }
        }
        if(word.length()!=0){
            finalAns+=reverse(word)+" ";
        }
        return finalAns;


    }
    public static String reverse(String str){
        // int i=0;
        // int j=arr.length;
        // char temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        // i++;
        // j--;
        String s="";
        for(int i=str.length()-1;i>=0;i--){
             s+=str.charAt(i);

        }
        return s;


    }
    public static void main(String[] args) {
        String str=" my    name   is  khushi           ";
        System.out.println( reverseWords(str));
    }
}
    

