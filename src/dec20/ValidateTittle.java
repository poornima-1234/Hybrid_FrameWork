package dec20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTittle {

	public static void main(String[] args)throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://google.com");
		Thread.sleep(5000);
		String expected = "Google";
		String actual = driver.getTitle();
		//verify expected title with actual title
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("Title is matching::::"+expected+ "   " +actual);

		}
		else
		{
			System.out.println("Title is not matching:::::"+expected+ "    " +actual);
		}
		driver.close();
	}
}


