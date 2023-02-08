package jan4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		System.out.println("Pagetitle[1]"+driver.getTitle());
		//click gmail link in google page
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Pagetitle[2]"+driver.getTitle());
		//click on back button to goto previous page
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Pagetitle[3]"+driver.getTitle());
		//click on forward button to next page
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("Pagetitle[4]"+driver.getTitle());
		//reload page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
			}

}
