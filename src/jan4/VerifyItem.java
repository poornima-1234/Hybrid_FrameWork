package jan4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItem {

	public static void main(String[] args) throws Throwable{
		String expecteditem = "baby";
		//String expecteditem = "hyderabad";

		boolean itemexist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");

		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>alloptions = listbox.getOptions();
		System.out.println("No:of items are "+alloptions.size());
		for(WebElement each:alloptions){
			//capture each item name
			String actualitems= each.getText();
			Thread.sleep(5000);
			System.out.println(actualitems);
			//verify expected item with actual items
			if (actualitems.equalsIgnoreCase(expecteditem)) {
				itemexist=true;
				break;

			}
		}

		if(itemexist)
		{
			System.out.println("item exist in Listbox:::"+expecteditem);

		}
		else
		{
			System.out.println("Item not exist in Listbox::"+expecteditem);

		}
		Thread.sleep(5000);
		driver.close();
	}

}
