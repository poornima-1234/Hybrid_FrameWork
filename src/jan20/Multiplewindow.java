package jan20;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args)throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(5000);
		//click three links
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		//store all windows into arraylist
		ArrayList<String>allwins = new ArrayList<String>(driver.getWindowHandles());
		//Switch to air ticketing window
		driver.switchTo().window(allwins.get(3));
		//Thread.sleep(5000);
		//click checkbox
		//driver.findElement(By.name("").click();
		//Thread.sleep(5000);
		driver.close();
		//switch to hotel window
		driver.switchTo().window(allwins.get(2));
		//Thread.sleep(5000);
		String expectedtitle = "IRCTC Hotels";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching::"+expectedtitle+"  "+actualtitle);
			
		}
		else
		{
			System.out.println("title is not matching::"+expectedtitle+"  "+actualtitle);
		}
		Thread.sleep(5000);
//driver.close();
		
	}

}
