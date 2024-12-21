package week1.day3;
public class Browser {
public String launchBrowser(String browserName) {
	return browserName;}
public void loadUrl(){
System.out.println("Application loaded successfully");
}
	public static void main(String[] args) {
Browser b=new Browser();
String browserName;
browserName=b.launchBrowser("FireFox");
System.out.println(browserName + " opened successfully");
b.loadUrl();}
}
