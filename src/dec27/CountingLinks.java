package dec27;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rediffmail.com");
		Thread.sleep(5000);
		//get collection of links in a page which are stored into html tag a
			List<WebElement>alllinks = driver.findElements(By.tagName("a"));
			System.out.println("No of links are:::"+alllinks.size());
			Thread.sleep(5000);
			for (WebElement each : alllinks) {
				System.out.println(each.getText());
				
			}
			
			driver.quit();

	}

}
