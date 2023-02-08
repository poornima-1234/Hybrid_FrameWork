package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateGMlogin {

	public static void main(String[] args)throws Throwable{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		//store username into webelement
		WebElement elementuser = driver.findElement(By.xpath("//input[@id='email']"));
		elementuser.clear();
		elementuser.sendKeys("vinnudruthi@gmail.com");
		//capture username value
		String username = elementuser.getAttribute("value");
		
		//driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		Thread.sleep(2000);
		//store password textbox
		WebElement elementpass = driver.findElement(By.xpath("//div[@id='passContainer']"));
		//elementpass.clear();
		elementpass.sendKeys("vinnu@123");
		String password = elementpass.getAttribute("value");
		System.out.println(username+"   "+password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='u_0_9_Ez']")).click();
		driver.quit();

	}


	}


