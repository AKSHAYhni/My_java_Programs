package functinalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 {

	  static WebDriver driver;
	     
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       driver=new ChromeDriver();
	       driver.get("https://www.google.com/");
	       System.out.println(driver.getCurrentUrl());
	       System.out.println(driver.getTitle());
	       
		}

	}
