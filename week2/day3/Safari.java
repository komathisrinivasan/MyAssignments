package week2.day3;

public class Safari  extends Browser{
	public void readerMode() {
		System.out.println("ReaderMode");
	}
	public void fullScreenMode() {
		System.out.println("FullScreenMode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Safari Sa = new Safari();
Sa.openURL();
Sa.closeBrowser();
Sa.navigateBack();
Sa.readerMode();
Sa.fullScreenMode();
	}
}
