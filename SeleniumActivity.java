package harikrish;

import activity.ChromeDriver;
import activity.WebDriver;

public class SeleniumActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	     driver.navigate().to("http://demo.guru99.com//newtours/register.phptest");



	}

}
