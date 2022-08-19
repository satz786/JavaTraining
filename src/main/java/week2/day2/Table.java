package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://erail.in/");
		 
		 WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
		 fromstation.clear();
		 fromstation.sendKeys("MS",Keys.TAB);
		 
		 
		 WebElement tostation = driver.findElement(By.id("txtStationTo"));
		 tostation.clear();
		 tostation.sendKeys("PDY",Keys.TAB);
		 
		 WebElement sortdate = driver.findElement(By.id("chkSelectDateOnly"));
		 
			 sortdate.click();
			 
			 List<WebElement> trow = driver.findElements(By.xpath("(//table)[3]//tbody/tr"));
			 List<WebElement> tdata = driver.findElements(By.xpath("(//table)[3]//tbody/tr[1]//td"));
		
			for(int i =1 ; i<=trow.size(); i++)
			{
				for(int j=1; j<=6; j++)
				{
					String text = driver.findElement(By.xpath("(//table)[3]//tbody/tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text);
					
				}
				System.out.println("");	
			}
			 
			 
	}

}
