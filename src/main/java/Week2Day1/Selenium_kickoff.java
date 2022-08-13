package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_kickoff {

	 public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));
	 loginbtn.click();
	 
	 WebElement headtxt = driver.findElement(By.tagName("h2"));
	 String welcometxt = headtxt.getText();
	 System.out.println(welcometxt);
	 
	 
	 WebElement crmsfa = driver.findElement(By.id("button"));
	 crmsfa.click();
	 
	 //Click on Leads
	 WebElement leadsmenu = driver.findElement(By.linkText("Leads"));
	 leadsmenu.click();
	 
	 WebElement createLeadnav = driver.findElement(By.linkText("Create Lead"));
	 createLeadnav.click();
	 
	 WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
	 companyname.sendKeys("testleaf");
	 
	 WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
	 firstname.sendKeys("sathish");
	 
	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 source.sendKeys("Conference");
	 
	 WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select industrydd = new Select(industry);
	 industrydd.selectByIndex(2);
	 
	 
	 WebElement marketingcampaing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select mc = new Select(marketingcampaing);
	 mc.selectByValue("9002");
	 
	 WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select ownerdd = new Select(owner);
	 ownerdd.selectByVisibleText("Partnership");
	 }

	
	
}
