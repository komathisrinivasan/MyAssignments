package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Cinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//OpenURL
		driver.get("https://www.pvrcinemas.com/");
		//Select City
		//Select the city
				driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Chennai')]")).click();
				
				//Select the Cinema		
				driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
						
				//Select the theatre
				driver.findElement(By.xpath("//span[text() =\"Select Cinema\"]")).click();
				driver.findElement(By.xpath("//span[text() =\"PVR Sathyam Royapettah Chennai\"]")).click();
				
				//Select the date
				driver.findElement(By.xpath("//span[text() = \"Today\"]")).click();
				
				Thread.sleep(2000);
				//Select the movie
				driver.findElement(By.xpath("(//span[text() = \"THE SMILE MAN\"])[2]")).click();
				
				Thread.sleep(2000);
				//Select the time
				driver.findElement(By.xpath("//span[contains(text(), '12:30 PM')]")).click();
				
				Thread.sleep(2000);
				//Click on book button
				driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']")).click();
				
				driver.findElement(By.xpath("//button[@class = \"sc-iBPTVF eafRB reject-terms\"]")).click();
				driver.findElement(By.id("EL.ELITE|D:1")).click();
				
				driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
				String seatInfo = driver.findElement(By.xpath("//div[@class = \"seat-info\"]")).getText();
				System.out.println(seatInfo);
				
				driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).click();
				String grandTotal = driver.findElement(By.xpath("//div[@class='tickets-count']")).getText();
				System.out.println(grandTotal);
				
				driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
				
				driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
				
				driver.close();
				
				
			}

		}