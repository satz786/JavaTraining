package week3.day1;

import org.openqa.selenium.WebElement;

public interface Plan {

	
	int sqft = 1200;
	int length = 60;
	int width = 20;
	
	/**
	 * We need consruct this in 100sqft with car parking 
	 * @author sathish
	 * 
	 * @param 100 sqft
	 */
	public void buildBalcony();
	
	
	/**
	 * We need to consurct this in 300 sqft with marble floor
	 * @author sathish
	 */
	
	public void buildHall();
	
	
	/**
	 * We need to consurct this in 200 sqft with marble floor and attached bathroom
	 * @author sathish
	 */
	public void buildbedroom();
	
	
	/**
	 * This will click on the element 
	 */
	public void clickonelement(String name);
	
}
