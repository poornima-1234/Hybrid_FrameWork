package jan4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/Selenium%20files/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		for(int i=0;i<5;i++)
		{
			dropdown.selectByIndex(i);
			
			
		}
		//get collection of items which are selected
		List<WebElement>alloptions= dropdown.getAllSelectedOptions();
		System.out.println(alloptions.size());
		//print names of items which are selected
		for(WebElement each:alloptions) {
			System.out.println(each.getText());
		}
 Thread.sleep(3000);
 driver.quit();
 
	}

}
