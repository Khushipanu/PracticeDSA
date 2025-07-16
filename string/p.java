public class p {


        // Method to reverse a string
        public static String reverse(String str){     
            int n = str.length() - 1;
            String s = "";
            // Reverse the string by appending characters in reverse order
            for (int i = n; i >= 0; i--) {
                s += str.charAt(i);     
            }
            return s;
        }
    
        // Method to reverse the order of words in the sentence
        public static String reverseT(String str) {
            String word = "";
            String res = "";
            
            // Reverse the entire string first (e.g., "the pen" -> "nep eht")
            String rs = reverse(str); 
    
            // Iterate over the reversed string to collect words
            for (int i = 0; i < rs.length(); i++) {
                if (rs.charAt(i) != ' ') {   // If it's not a space, build the word
                    word += rs.charAt(i);
                } else {
                    // When a space is encountered, reverse the word and add it to the result
                    res += reverse(word) + " ";
                    word = ""; // Reset word for the next one
                }
            }
    
            // Add the last word if any (after the loop ends)
            if (word.length() != 0) {
                res += reverse(word);  // Reverse the last word
            }
    
            return res;
        }
    
        public static void main(String[] args) {
            String str = "the pen";
            System.out.print(reverseT(str));  // Expected output: "pen the"
        }
    }
    
    

