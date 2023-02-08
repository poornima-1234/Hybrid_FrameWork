package jan31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {
 
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		//get collection of frames
		List<WebElement>allframes= driver.findElements(By.tagName("iframe"));
		System.out.println("No:of frames::"+allframes.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst= driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).perform();
		Thread.sleep(2000);
		//come out from frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//click button link
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
