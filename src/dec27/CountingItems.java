package dec27;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingItems {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.in");
		Thread.sleep(5000);
		Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
		//count no of items
		List<WebElement>alloptions = element.getOptions();
		System.out.println("no:of items are:::"+alloptions.size());
		Thread.sleep(4000);
		for (WebElement each: alloptions) {
			Thread.sleep(4000);
			System.out.println(each.getText());
			
		}
Thread.sleep(4000);
driver.quit();
	}

}
