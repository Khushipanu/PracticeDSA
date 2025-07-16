
public class ValidAnagram {
    public static boolean validanagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);  //s
            arr[ch-'a']++;
        }
          for(int i=0;i<t.length();i++){
            char ch=s.charAt(i);  //s
            arr[ch-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="sit";
        String t="tifs";
        System.out.println( validanagram(s,t));
       }
    
}
