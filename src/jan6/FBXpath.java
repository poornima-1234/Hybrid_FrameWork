package jan6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBXpath {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@id,'u')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Testing");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("Surname");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("test@7687");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(10);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByIndex(60);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[9]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//following::button[1]")).click();
		
		
	}

}
