package jan31;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//print title & length of title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url & length of url
		String Strurl = js.executeScript("return document.URL").toString();
		System.out.println(Strurl);
		System.out.println(Strurl.length());
		//print Domain name & length
		String DomainName = js.executeScript("return document.domain").toString();
		System.out.println(DomainName);
		System.out.println(DomainName.length());
		driver.quit();


	}

}
