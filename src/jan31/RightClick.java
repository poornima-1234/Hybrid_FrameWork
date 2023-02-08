package jan31;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.get("http://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//take mouse to gmail link & right click on to
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		//Create object for robot class
		Robot r = new Robot();
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to child window gmail
		driver.switchTo().window(brw.get(1));
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-label='header']//span[@class='laptop-desktop-only']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		//switch to parent window google page
		driver.switchTo().window(brw.get(0));
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
	Thread.sleep(6000);
		driver.close();



	}

}
