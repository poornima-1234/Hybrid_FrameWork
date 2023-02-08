package jan31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Register'])[1]")).click();
		Thread.sleep(2000);
js.executeScript("document.querySelector(\"#input-firstname\").value='Testing'");
driver.findElement(By.name("lastname")).sendKeys("Testing");
driver.findElement(By.name("email")).sendKeys("poonu123@gmail.com");
driver.findElement(By.name("password")).sendKeys("test@1234");
js.executeScript("window.scrollBy(0,400)");
Thread.sleep(5000);
js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		//Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		
//Thread.sleep(5000);
js.executeScript("document.querySelector(\"button[type='submit']\").click()");
//driver.quit();

		
		
		
	}

}
