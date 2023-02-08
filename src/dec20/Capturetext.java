package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturetext {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String variable = driver.findElement(By.partialLinkText("Gm")).getText();
		System.out.println(variable);
		//capture url of gmail link which is stored into one property
		String element = driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(element);
		driver.quit();

	}

}
