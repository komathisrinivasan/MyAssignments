package week1.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//loadUrl
		driver.get("https://www.facebook.com/");
	//maximize the screen
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText(" Find your account and log in.")).click();
		System.out.println(driver.getTitle());
		
		
		//close the browser
		driver.close();
		

	}

}
