package functinalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9 {
     static WebDriver driver;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get("https://meet.google.com/rcw-twpu-yhb?pli=1");
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       
	}

}