package week3.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
		
		List<WebElement> fbTotal = driver.findElements(By.tagName("a"));
		int size = fbTotal.size();
		System.out.println("Total 'a' tag in fb is :" +size);
		
		for(int i=0; i<fbTotal.size(); i++) {
			System.out.println(fbTotal.get(i).getText());
	}
		driver.close();
	}

}
