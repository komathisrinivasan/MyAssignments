package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;

public class AdvancedXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		
driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("dilip@testleaf.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
driver.findElement(By.xpath("//div[@id='pwcaps']//following-sibbling::input[1]")).click();

driver.close();
	}

}
