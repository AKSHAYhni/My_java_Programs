package functinalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate_To
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://carpick.nedient.co.in");
	    
		driver.navigate().to("https://carpick.nedient.co.in/Admin_Login/#1");
		
		Thread.sleep(2000);
		driver.navigate().to("https://carpick.nedient.co.in/Admin_Login/#2");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().to("https://carpick.nedient.co.in/Admin_Login/#3");
		Thread.sleep(2000);
		driver.navigate().to("https://carpick.nedient.co.in/Admin_Login/#6");
		Thread.sleep(2000);
		driver.navigate().to("https://carpick.nedient.co.in/Admin_Login/#7");
		Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	}

}
