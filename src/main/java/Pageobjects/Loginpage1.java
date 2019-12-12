package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage1 {
	public WebDriver driver;
	
	By Email=By.xpath("//*[@type='email']");
	By Password=By.xpath("//*[@type='password']");
	By Login=By.xpath("//*[@name='commit']");
	
	public  Loginpage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
this.driver=driver;	

}
	
	public WebElement Email() {

		return driver.findElement(Email);
	}
	public WebElement Password() {

		return driver.findElement(Password);
	}
	public WebElement Login() {

		return driver.findElement(Login);
	}

	
	
}
