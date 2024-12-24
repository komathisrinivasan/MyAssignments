package week2.day1;
public class JavaChallenge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="How are you Komathi";
		System.out.println("Original String: " + str1);
		System.out.println("The Length of last word is :" + lengthOfLastWord(str1));

	}
	public static int lengthOfLastWord(String str1) {
		//Initializing the variable value to store the length of last word
	    int length_word = 0;
	  String[] words = str1.split(" ");
	      if (words.length > 0) {
	          length_word = words[words.length -1].length();
	        }
	       else {
	        length_word = 0;
	      }
	    return length_word;
	  }
	
}
