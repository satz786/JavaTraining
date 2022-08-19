package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement signupbutton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		signupbutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Testleaf");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("S");
		
		WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobilenumber.sendKeys("7845644585");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("Mani@222");
		
		WebElement birthdayname = driver.findElement(By.name("birthday_day"));
		Select birthdaynamedd = new Select(birthdayname);
		birthdaynamedd.selectByVisibleText("18");
		
		WebElement birthdaymonth = driver.findElement(By.name("birthday_month"));
		Select birthdaymonthdd = new Select(birthdaymonth);
		birthdaymonthdd.selectByValue("1");
		
		WebElement birthdayyear = driver.findElement(By.name("birthday_year"));
		Select birthdayyeardd = new Select(birthdayyear);
		birthdayyeardd.selectByVisibleText("1994");
		
		WebElement Maleradio = driver.findElement(By.xpath("(//label[text()='Female'])"));
		Maleradio.click();
	
	
	}

}
