package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
    public static void main(String[] args) throws InterruptedException {
    	ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("");
		driver.findElement(By.name("lastname")).sendKeys("Partheban");
		driver.findElement(By.name("reg_email__")).sendKeys("8190874826");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Lekha@2911");
		WebElement d1 = driver.findElement(By.id("day"));
		Select op=new Select(d1);
	    op.selectByIndex(23);
	    WebElement d2 =driver.findElement(By.id("month"));
	    Select op1=new Select(d2);
	    op1.selectByVisibleText("Jun");
	    WebElement d3 = driver.findElement(By.id("year"));
	    Select op2=new Select(d3);
	    op2.selectByValue("2000");
	    driver.findElement(By.className("_58mt")).click();
    	
    	
    }
}