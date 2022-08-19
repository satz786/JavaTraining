package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1Assignment2 {

	public static void main(String[] args) 
	{
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.manage().window().maximize();
		    
		    
		    // 2. Enter UserName and Password Using Id Locator
		    WebElement usernametextbox = driver.findElement(By.xpath("//input[@id='username']"));
		    usernametextbox.sendKeys("Demosalesmanager");
		    
		    WebElement passwordtextbox = driver.findElement(By.xpath("//input[@id='password']"));
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
		    
			//6. Click on Create Lead
		    WebElement createleadbutton = driver.findElement(By.xpath("//a[(text()='Create Lead')]"));
		    createleadbutton.click();
		    
			//7. Enter CompanyName Field Using id Locator
		    WebElement companynametextbox = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		    companynametextbox.sendKeys("Testleaf");
		    
		    
		   // 8. Enter FirstName Field Using id Locator
		   WebElement firstnametextbox = driver.findElement(By.xpath("(//input[@name='firstName'])[1]"));
		   firstnametextbox.sendKeys("Sagayaranjith");
		   
		   
		   // 9. Enter LastName Field Using id Locator
		   WebElement secondnametextbox = driver.findElement(By.id("createLeadForm_lastName"));
		   secondnametextbox.sendKeys("B");  
		   
	      //10. Enter FirstName(Local) Field Using id Locator
		   WebElement firstnamelocaltextbox = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		   firstnamelocaltextbox.sendKeys("Ranjith");
		   
		   
		   
		//11. Enter Department Field Using any Locator of Your Choice
		   WebElement departmentnametextbox = driver.findElement(By.name("departmentName"));
		   departmentnametextbox.sendKeys("CSE");
		   
		   
		// 12. Enter Description Field Using any Locator of your choice 
	    
		   WebElement descriptiontextbox = driver.findElement(By.id("createLeadForm_description"));
		   descriptiontextbox.sendKeys("This is new lead");
		   
		   //13. Enter your email in the E-mail address Field using the locator of your choice
		   WebElement emailtextbox = driver.findElement(By.id("createLeadForm_primaryEmail"));
		   emailtextbox.sendKeys("sathish.s@mailinator.com");
		   
		   
	    //14. Select State/Province as NewYork Using Visible Text
	   WebElement statefield = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		   Select statefielddropdown = new Select(statefield);
		   statefielddropdown.selectByVisibleText("New York");
		   
		   
		   
		   //15. Click on Create Button
	      WebElement submitbutton = driver.findElement(By.name("submitButton"));
	      submitbutton.click();
		   
		
		   
		   //16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		    String title = driver.getTitle();
		    if(title.contains("View Lead"))
		    {
		    	System.out.println("The Lead is saved properly title verified");
		    }
	

	
	 //17. Click on Duplicate button
      WebElement duplicateleadbutton = driver.findElement(By.linkText("Duplicate Lead"));
      duplicateleadbutton.click();
	
	//18. Clear the CompanyName Field using .clear() And Enter new CompanyName
     WebElement companynameeditfield = driver.findElement(By.id("createLeadForm_companyName"));
     companynameeditfield.clear();
     companynameeditfield.sendKeys("Testleaf Edited");
      
      //19.Clear the FirstName Field using .clear() And Enter new FirstName
     WebElement firstnameedit = driver.findElement(By.id("createLeadForm_firstNameLocal"));
     firstnameedit.clear();
     
     
     //20.Click on Create Lead Button
     WebElement submitbuttonedit = driver.findElement(By.name("submitButton"));
     submitbuttonedit.click();
     
     //21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
	

	   //16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
	    String title1 = driver.getTitle();
	    if(title1.contains("View Lead"))
	    {
	    	System.out.println("The Lead is edited properly title verified");
	    }


	}

}
