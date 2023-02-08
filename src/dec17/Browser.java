package dec17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) throws Throwable{
		//create instance object
		//System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		driver.quit();


	}

}
