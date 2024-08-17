package functinalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
     static WebDriver driver;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get("https://carpick.nedient.co.in/");
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       
	}

}
