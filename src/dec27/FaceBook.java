package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		//Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[contains(@id,'u_')])[1]")).sendKeys("Druthi");
		
		//driver.findElement(By.xpath("//*[@id="u_2_b_uo"]")).sendKeys("dsfd");
		driver.findElement(By.name("firstname")).sendKeys("Druthi");
		driver.findElement(By.name("lastname")).sendKeys("vinnu");
	driver.findElement(By.name("reg_email__")).sendKeys("vinnudruthi123@gmail.com");
	
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vinnudruthi123@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("vinnu@123");
		Select monthlistbox= new Select(driver.findElement(By.name("birthday_month")));
	
		Select daylistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		monthlistbox.selectByVisibleText("Nov");
		Thread.sleep(2000);
		daylistbox.selectByIndex(10);
		Thread.sleep(2000);
		
		yearlistbox.selectByVisibleText("1978");
		Thread.sleep(2000);
		//verify daylist is single or multiple selection
		boolean flag = daylistbox.isMultiple();
		System.out.println(flag);
		driver.findElement(By.tagName("label")).click();
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
//driver.quit();
Thread.sleep(4000);

	}

}
