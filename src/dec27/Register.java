package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click register link
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("poonu");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("9987346564");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poonu12345@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("poonu123");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Female");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String message = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/h4")).getText();
		System.out.println(message);
		driver.quit();

	}

}
