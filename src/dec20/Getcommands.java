package dec20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args)throws Throwable 
	{
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.in");
		Thread.sleep(5000);
		//print title & length of title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url & length of url
		String strurl = driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.close();

	}

}
