package jan31;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//scroll vertically top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel vertically
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(7000);
		driver.close();
		
				

	}

}
