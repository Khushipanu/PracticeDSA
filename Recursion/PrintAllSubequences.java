public class PrintAllSubequences {

    public static void printSSQ(String str,String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr=str.charAt(0);
        String remString=str.substring(1);

        //curr char-> chooses to be a  part 
        printSSQ(remString,currAns+curr);

        //curr char-> doesnt choose to be a part of currAns
        printSSQ(remString,currAns);

    }
    public static void main(String[] args) {
        printSSQ("abc","");
        
    }
    
}
