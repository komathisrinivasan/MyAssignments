package week2.day3;

public class Browser {
	
public void openURL() {
	System.out.println("OpenURL");
}
public void closeBrowser() {
	System.out.println("CloseBrowser");
}
public void navigateBack() {
	System.out.println("NavigateBack");
}
	
public static void main(String[] args) {
	Browser Br = new Browser();
	Br.openURL();
	Br.closeBrowser();
	Br.navigateBack();
}
}

