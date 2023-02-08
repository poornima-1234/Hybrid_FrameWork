package jan10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRadiobutton {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		//driver.findElement(By.name("email")).sendKeys("poornima.savasere@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("r74r09d13p84");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
		//get collections of radio buttons
		List<WebElement>allradio =driver.findElements(By.xpath(""));
		System.out.println("No.of radio buttons::"+allradio.size());
         for(WebElement each : allradio)
         {
        	 System.out.println(each.getText());
         }
         driver.quit();
         
	}

}
