package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Login_FB {

	public static void main(String[] args)throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://facebook.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("poornima.savasere@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("xyz");
		driver.findElement(By.name("login")).click();
		//suspend tool for 5sec
		Thread.sleep(5000);
		driver.quit();
	}
}



