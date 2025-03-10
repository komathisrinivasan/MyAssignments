package javaChallenge;

public class JavaChallenge3 {

	    public static boolean isPalindrome(String s) {
	        s = s.toLowerCase();

	        // Reverse the string
	        String rev = "";
	        for (int i = s.length() - 1; i >= 0; i--) {
	            rev = rev + s.charAt(i);
	        }

	        return s.equals(rev);
	    }

	    public static void main(String[] args) {
	      
	        // Input string
	        String s = "race a car";

	        // Check if the string is a palindrome
	        boolean res = isPalindrome(s);

	        // Print the result
	        if (res) {
	            System.out.println("\"" + s + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + s + "\" is not a palindrome.");
	        }
	    }
	}

