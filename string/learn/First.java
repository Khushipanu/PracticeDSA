 import java.util.*;
public class First{
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append("hi");
        str.deleteCharAt(2);
        str.delete(1,3);
        System.out.println(str);
       
        

    }


}

