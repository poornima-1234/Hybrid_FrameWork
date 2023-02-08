package jan10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCounting {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/Selenium%20files/checkbox_1.html");
        Thread.sleep(5000);
        //get collection of checkboxes
        List<WebElement>allcheck=driver.findElements(By.xpath("//*[@type='checkbox']"));
        System.out.println("No.of checkboxes are::"+allcheck.size());
        for(WebElement each: allcheck) {
        	//verify which checkbox is true or false
        boolean value = each.isSelected();
        
        	//print name of each checkbox
        	String checkboxname =each.getAttribute("value");
        	System.out.println(checkboxname+"   "+value);
        	
        	if(value)
        	{
        		//if checkbox is true uncheck
        		each.click();
        	}
        	else
        	{
        		//if checkbox is false check it
        		each.click();
        	}
        	Thread.sleep(5000);
        }
        	Thread.sleep(4000);
        	driver.close();
        	}
        }
	


