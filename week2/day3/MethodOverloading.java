package week2.day3;

public class MethodOverloading {
	public void reportStep(String message, String status) {
		System.out.println(message + status);
	}

	public void reportStep(String message, String status, String snap) {
		System.out.println(message + status + snap);
	}

	public static void main(String[] args) {
	MethodOverloading O = new MethodOverloading();
	O.reportStep("Hi", " I am Good");
	O.reportStep("Hello", " How are you", " Snap");

	}

}
