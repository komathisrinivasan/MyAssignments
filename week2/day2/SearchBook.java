package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class SearchBook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println("Title of the Page: "+title);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Get text from application :"+text);
		//Replace  the comma
		String replace = text.replace (",","");
		System.out.println("Replace the comma with the empty value"+replace); 
		//convert the string to integer
		int int1 = Integer.parseInt(replace);
		System.out.println("Convert the String to Int :"+int1);
		
		String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
    	driver.close();

		}
}