package jan20;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window ids
		Set<String>allwins = driver.getWindowHandles();
		System.out.println(allwins);
		//itterate all windows
		for(String each:allwins) {
			//if parent not equals child then switch each child window
			if(!parent.equals(each))
			{
				//switch to each child window and get title and close
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}

		}

		//Switch tp parent
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("poonu@gmail.com");
		driver.quit();
	}
}


