package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatelogin {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username into webelement
		WebElement elementuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementuser.clear();
		elementuser.sendKeys("Admin");
		//capture username value
		String username = elementuser.getAttribute("value");
		Thread.sleep(2000);
		//store password textbox
		WebElement elementpass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementpass.clear();
		elementpass.sendKeys("Qedge123!@#");
		String password = elementpass.getAttribute("value");
		System.out.println(username+"   "+password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		Thread.sleep(2000);
		String expected ="dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login Success::"+expected+"   "+actual);
		}
		else
		{
			//capture error text
			String errormessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(errormessage+"   "+expected+"   "+actual);
		}
		driver.quit();

	}

}
