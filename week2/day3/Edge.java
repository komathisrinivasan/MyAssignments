package week2.day3;

public class Edge  extends Browser{
	public void takeSnap() {
		System.out.println("TakeSnap");
	}
	public void clearCookies() {
		System.out.println("ClearCookies");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Edge Ed = new Edge();
Ed.openURL();
Ed.closeBrowser();
Ed.navigateBack();
Ed.takeSnap();
Ed.clearCookies();
	}
}

	
