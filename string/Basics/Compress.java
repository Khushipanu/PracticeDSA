public class Compress {
      public static int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1) chars[idx++]=ch;
            else{
                chars[idx++]=ch;
                String num=String.valueOf(count);
                for(char c:num.toCharArray()){
                    chars[idx++]=c;
                }

            }

        }
        return idx;
        
    }
    public static void main(String args[]){
        char arr[]={'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
    
}
