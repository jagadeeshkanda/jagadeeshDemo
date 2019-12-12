package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Subscribe {
		public WebDriver driver;

		
		By close=	By.cssSelector("button[style*='background-color: rgba(29, 116, 232, 0);']");

public Subscribe(WebDriver driver) {
			// TODO Auto-generated constructor stub
this.driver=driver;	

}

public WebElement subscribtion() {

	return driver.findElement(close);	
	
}

}


