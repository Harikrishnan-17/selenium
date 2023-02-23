package harikrish;

import java.text.NumberFormat;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicwebTable {
	public static void main(String args[]) {

		System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    WebDriver wd=new ChromeDriver();
	    wd.get("http://demo.guru99.com/test/web-table-element.php");
        String max;
        double m=0,r=0;
        
          //No. of Columns   
           List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
           System.out.println("Total No of columns are : " +col.size());
           //No.of rows
           List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
           System.out.println("Total No of rows are : " + rows.size());
           for (int i =1;i<rows.size();i++)
           {    
               max= wd.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
               NumberFormat f =NumberFormat.getNumberInstance();
               Number num = f.parse(max);
               max = num.toString();
               m = Double.parseDouble(max);
               if(m>r)
                {    
                   r=m;
                }
           }
           System.out.println("Maximum current price is : "+ r);

}
}
