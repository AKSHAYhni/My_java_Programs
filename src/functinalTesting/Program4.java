package functinalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
     static WebDriver driver;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       
	}

}

