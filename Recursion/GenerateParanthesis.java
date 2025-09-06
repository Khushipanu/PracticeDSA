public class GenerateParanthesis {
    public static String function(String ans,int open,int close){
        if(open==0 && close==0){
            return ans + ",";
        }
        String res="";
        
        if(open>0){
            res+=function(ans+="(",open-1,close);
        }
        if(close>open){
            res+= function(ans+")",open,close-1);
        }
        return res;
    }
    public static void main(String args[]){
        String result=function("",3,3);
        if(result.endsWith(",")){
            result=result.substring(0,result.length()-1);

        }
        System.out.println(result);

    }
    
}
