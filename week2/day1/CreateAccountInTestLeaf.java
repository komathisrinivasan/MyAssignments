package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountInTestLeaf {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.partialLinkText("Account")).click();
			driver.findElement(By.partialLinkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("KomathiKP29");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			WebElement d1 = driver.findElement(By.name("industryEnumId"));
			Select op=new Select(d1);
		    op.selectByIndex(3);
		    WebElement d2 =driver.findElement(By.name("ownershipEnumId"));
		    Select op1=new Select(d2);
		    op1.selectByVisibleText("S-Corporation");
		    WebElement d3 = driver.findElement(By.id("dataSourceId"));
		    Select op2=new Select(d3);
		    op2.selectByValue("LEAD_EMPLOYEE");
		    WebElement d4 =driver.findElement(By.id("marketingCampaignId"));
		    Select op3=new Select(d4);
		    op3.selectByIndex(6);
		    WebElement d5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		    Select op4=new Select(d5);
		    op4.selectByValue("TX");
		    driver.findElement(By.className("smallSubmit")).click();
		  
		    
		    
		    
		    

	}

}

