package dec27;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBCountingItems {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(2000);


		Select listbox = new Select(driver.findElement(By.id("month")));
		//count no of items
		List<WebElement>alloptions = listbox.getOptions();
		System.out.println("no:of items are:::"+alloptions.size());
		Thread.sleep(4000);
		for (WebElement each: alloptions) {
			Thread.sleep(4000);
			System.out.println(each.getText());
		}

			Select day = new Select(driver.findElement(By.id("day")));
			//count no of items
			List<WebElement>all= day.getOptions();
			System.out.println("no:of items are:::"+all.size());
			Thread.sleep(4000);
			for (WebElement every: all) {
				Thread.sleep(4000);
				System.out.println(every.getText());

			}
				Select year = new Select(driver.findElement(By.id("year")));
				//count no of items
				List<WebElement>allopt = year.getOptions();
				System.out.println("no:of items are:::"+allopt.size());
				Thread.sleep(4000);
				for (WebElement ele: allopt) {
					Thread.sleep(4000);
					System.out.println(ele.getText());
				}

			}
			
		

		
	}


