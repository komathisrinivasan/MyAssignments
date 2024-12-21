package week1.day3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		//checks for the length of the strings
		if(str1.length() != str2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
			//converting both the array to character array
			char[] String1 = str1.toCharArray();
			char[] String2 = str2.toCharArray(); 
			
			//sorting the arrays using in-built function sort()
			Arrays.sort(String1);
			Arrays.sort(String2);
			 
			//comparing both the arrays using in-built function equals()
			  if(Arrays.equals(String1, String2) == true) {
				  System.out.println("The given Strings are Anagram");
			  }
			  else {
				  System.out.println("The given Strings are not Anagram");
			  }
		}
	}

}
