package harikrish;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMaven {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://demoqa.com/automation-practice-form");
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click();
	    
	     driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Harikrishnan");
	     driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("harikrishnam@maveric-systems.com");
	     driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("NO:10 chunampet chennai tamilnadu");
	     driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("NO:10 chunampet chennai");
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")).click();
	     //driver.manage().window().maximize();
	     
	     //driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();

	}

}
