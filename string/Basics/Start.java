

public class Start {
    public static void main(String args[]){


        String s="sid";
        String s2="sid";
        System.out.println(s.equals(s2));


        String str=new String("khushi");
        String str2=new String("khushi");
        System.out.println(str.equals(str2));


        System.out.println(str);
        System.out.println(str2);
        String t="A man , a plan ";
        String y=t.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(y);

        System.out.println('b'-'a'); //it gives integer
    }
    
}
