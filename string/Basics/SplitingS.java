
public class SplitingS {
    public static void main(String[] args) {
        // String str="khushi  panu";
        // String arr[]=str.split(" ");
        // for(String s1:arr){
        //     System.out.print(s1);
        // }

         String s = "This is     comma    fullstop  whitespace";

        // The regex [,\\.\\s] splits the string by
        // commas (,), spaces (\\s), and periods (\\.)
        // String regex = "[,\\s\\.]";

        // using split() method
        String[] arr = s.split(" ");

        // Print each element of the resulting array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
