package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");

//Create object for select class
WebElement dd1= driver.findElement(By.id("Dropdown-1"));
Select op=new Select(dd1);
op.selectByIndex(5);

WebElement dp= driver.findElement(By.id("Dropdown-2"));
Select op1=new Select(dp);
op1.selectByVisibleText("UI for WinForms");

WebElement kp= driver.findElement(By.id("Country-1"));
Select op2=new Select(kp);
op2.selectByValue("India");

	}

}
