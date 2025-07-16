public class Toggle {
    public static void main(String args[]){
        String str="aPhysics";
        String str2="";
        for(int i=0;i<str.length();i++){  
            boolean flag=true;  //capital
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97){  //small
                flag=false;

            }
            if(flag==true){
                ascii+=32;
              
            }else{
                ascii-=32;

            }
            char rechar=(char)ascii;
            str=str.substring(0,i) + rechar +str.substring(i+1);
            


            // if(ch>=97 && ch<=122){  //small
            //     int ascii=(int)ch; 
            //     ascii-=32;    //bada
            //     char newchar=(char)ascii;
            //     str2+=newchar;
               

            // }else{//bada

            //     int ascii=(int)ch;
            //     ascii+=32;
            //     char newchar=(char)ascii;
            //     str2+=newchar;
              

            // }

        }
        System.out.println(str);
        // System.out.println(str2);

    }
    
}
