package week2.day3;

public class MethodOverriding {
	public void takeSnap(String takeSnapmessage) {
		System.out.println(takeSnapmessage );
	}

	public void reportStep(String message, String status) {
		System.out.println(message + status );
	}

	public static void main(String[] args) {
	MethodOverriding Mr = new MethodOverriding();
	Mr.takeSnap("Snap Taken");
	
}
}
