package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DeleteLead {

	/*	Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
	
	*/
	
public static String  regnum;
	
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
		
	
	  //6. Click on find Leads
	    WebElement findleads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
	    findleads.click();
	    
	    
	    //7.click on phonetab
	    WebElement phonetab = driver.findElement(By.xpath("//span[text()='Phone']"));
	    phonetab.click();
	    
	    
	    //8 Enter phone number
	    WebElement phonenumberfield = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
	    phonenumberfield.sendKeys("04426184682");
	   
	    
	    // 10	Click find leads button
	    WebElement findleadbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
	    findleadbutton.click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//11	Capture lead ID of First Resulting lead
		//12	Click First Resulting lead
	    for(int i = 1 ; i<=1 ; i++)
	    {
	    	for(int j=1; j<=1 ; j++)
	    	{
	    		WebElement tabledata = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr["+i+"]/td/div/a)["+j+"]"));
	    		  regnum = tabledata.getText();
	    		tabledata.click();
	    		
	    		
	    		
	    	}
	    }
	    
	    
	    
		//13	Click Delete
		WebElement deletebutton = driver.findElement(By.xpath("//a[text()='Delete']"));
		deletebutton.click();
		
		
	    //14	Click Find leads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement findleads2 = driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']"));
		 findleads2.click();
		    
		
		
		//15	Enter captured lead ID
		  String num = regnum;
		WebElement idnum = driver.findElement(By.xpath("//input[@name='id']"));
		    idnum.sendKeys(num);
		    
		    
		    //16	Click find leads button
		    
		    WebElement findleads3 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		    findleads3.click();
		    
		    
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		    WebElement norecord = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		    String norecordtext = norecord.getText();
		    if(norecordtext.contentEquals("No records to display"))
		    {
		    	System.out.println("There is no lead");
		    }
		    else
		    {
		    	System.out.println("There is a lead");
		    }
		    
		    
		    //18	Close the browser (Do not log out)
		driver.quit();
		
		

	}

}
