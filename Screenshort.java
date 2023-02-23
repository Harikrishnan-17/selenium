package harikrish;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import java.util.logging.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {
	public static void main(String args[]) throws Exception{
		 System.setProperty("webdriver.chromedriver","chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	        
	    
	     		
	}

}
