package jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlert {

	public static void main(String[] args)throws Throwable {
WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click singin button
		driver.findElement(By.name("proceed")).click();
		//capture alert text
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		//click on button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

	}


