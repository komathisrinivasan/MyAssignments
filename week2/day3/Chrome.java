package week2.day3;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("OpenIncognito");
	}
	public void clearCache() {
		System.out.println("ClearCache");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chrome Ch = new Chrome();
Ch.openURL();
Ch.closeBrowser();
Ch.navigateBack();
Ch.openIncognito();
Ch.clearCache();
	}

}
