package jan6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@id,'u')]")).click();
		Thread.sleep(5000);
		//verify email text is displayed or not
		WebElement email = driver.findElement(By.name("reg_email__"));
		boolean flag = email.isDisplayed();
		System.out.println(flag); 
		//verify reenter mail text box is displayed or hidden
		WebElement element = driver.findElement(By.name("reg_email_confirmation__"));
		boolean value = element.isDisplayed();
		System.out.println(value);
		//verify radio button is checked or unchecked
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='1']"));
		boolean value1=radiobtn.isSelected();
		System.out.println(value1);
		radiobtn.click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
