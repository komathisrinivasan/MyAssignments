package week1.day3;

public class ReverseOddWords {
    public static void main(String[] args) {
      
        String s = "I am a software tester"; 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
              
              // extracts each character
            ch = s.charAt(i);
          
              // adds each character in
            // front of the existing string
            r = ch + r; 
        }
      System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + r);
    }
}
