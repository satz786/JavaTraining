package week2.day2;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Editlead {
	
	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
*/
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    
	    
	    // 2. Enter UserName and Password Using Id Locator
	    WebElement usernametextbox = driver.findElement(By.id("username"));
	    usernametextbox.sendKeys("Demosalesmanager");
	    
	    WebElement passwordtextbox = driver.findElement(By.id("password"));
	    passwordtextbox.sendKeys("crmsfa");
	    
	    
        // 3. Click on Login Button using Class Locator
	    WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
	    loginbutton.click();
	
	    //4. Click on CRM/SFA Link
	    WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
	    crmlink.click();
	    
	    
	    //5. Click on Leads Button
	    WebElement leadbutton = driver.findElement(By.linkText("Leads"));
	    leadbutton.click();
		
	    
	    WebElement findleads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
	    findleads.click();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement Searchname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
	    Searchname.sendKeys("Divya");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    
	    WebElement findleadbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
	    findleadbutton.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   // WebElement table = driver.findElement(By.xpath("//div[@class='x-grid3-header-offset']/table"));
	  //  List<WebElement> Row = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//tr"));	    
	   // List<WebElement> columndata = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//tr/td"));
	    
	    for(int i = 1 ; i<=1 ; i++)
	    {
	    	for(int j=1; j<=1 ; j++)
	    	{
	    		WebElement tabledata = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr["+i+"]/td/div/a)["+j+"]"));
	    		tabledata.click();
	    		
	    		
	    	}
	    }
	 
	
	    
	    WebElement editbutton = driver.findElement(By.xpath("//a[text()='Edit']"));
	    editbutton.click();
	    
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    WebElement companyname = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
	    companyname.clear();
	    String companyvalue = "Newcompany";
	    companyname.sendKeys(companyvalue);
	    
	    WebElement updatebutton = driver.findElement(By.name("submitButton"));
	    updatebutton.click();
	    
	    WebElement companyname1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
	    String company = companyname1.getText();
	    
	    if(company.contains(companyvalue))
	    {
	    	System.out.println("The edited value is same");
	    }
	    else
	    {
	    	System.out.println("The edit is not happened");
	    }
	    
	}
	
	

}
