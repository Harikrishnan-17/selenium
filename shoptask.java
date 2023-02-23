package harikrish;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

public class shoptask {

	public static void main(String[] args) throws InterruptedException {
	  

		System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   // WebDriverWait wait =new WebDriverWait(driver,10);
	    //WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")));
	    driver.navigate().to("https://askomdch.com/");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	     js.executeScript("window.scrollBy(0,1150)", "");
	     driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[3]")).click();
	     Thread.sleep(1000);
	     js.executeScript("window.scrollBy(0,650)", "");

	 // File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	   //   FileHandler.copy(scrFile, new File("screenshot.png"));
	     driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	     Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("hari");
	    driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Krishnan");
	    driver.findElement(By.xpath("//*[@id=\"billing_company\"]")).sendKeys("Maveric systems,com");
	    
	    driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("No:10 main road streat");
	    driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("chunampet");    
	    driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("california");
	    driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("90230");
	    driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("6382747482");
	    driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("harikrishnan@maveric.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	   

	}

}
