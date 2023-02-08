package jan31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingmouse {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://flipkart.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//move to fashions
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		//click all link
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//move to Electronics
	ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Mouse"))).click().perform();
				Thread.sleep(5000);
				ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).click().perform();
				Thread.sleep(5000);
				ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
				Thread.sleep(5000);
				driver.quit();
				
				
		

	}

}
