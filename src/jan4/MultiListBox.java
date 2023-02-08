package jan4;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("E:/Selenium%20files/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify listbox in single or multiselcetion
		boolean value =dropdown.isMultiple();
		System.out.println(value);
		//Select 0-9 items in listbox
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(3000);
			dropdown.selectByIndex(i);
			
		}
dropdown.deselectByIndex(9);
Thread.sleep(2000);
dropdown.deselectByVisibleText("White");
Thread.sleep(2000);
dropdown.deselectByIndex(0);
Thread.sleep(2000);
dropdown.deselectAll();
Thread.sleep(2000);
driver.quit();

	}

}
