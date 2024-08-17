package functinalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://carpick.nedient.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/ul/li[1]/a/button")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/nav/ul/li[2]/a/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/ul/li[4]/a/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/ul/li[5]/a/button")).click();
		Thread.sleep(2000);
		//driver.navigate().to("https://carpick.nedient.co.in/#7");
		Thread.sleep(2000);
	}

}
