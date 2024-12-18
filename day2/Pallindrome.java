package week1.day2;
public class Pallindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //variables initialization
		    int num = 1224, reverse = 0;  
		  
		    // palindrome if num and reverse are equal  
		    if (getReverse(num, reverse) == num)  
		     System.out.println (num + " is Palindrome");  
		    else  
		      System.out.println (num + " is not Palindrome");  
		  }  
		//function to reverse the number    
		  static int getReverse(int num, int rev){  
		    if(num == 0)  
		        return rev;      
		    int rem = num % 10;  
		    rev = rev * 10 + rem;  
		    return getReverse(num / 10, rev);  
		}  
	}

