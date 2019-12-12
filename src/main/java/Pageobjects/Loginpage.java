package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
By login=	By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
By gettext=By.xpath("//div[@class='text-center']");
By navbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");


public  Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
this.driver=driver;	

}

public WebElement login() {

return driver.findElement(login);	

}
public WebElement gettitle() {
	return driver.findElement(gettext);
	
}
public WebElement navigationbar() {
	return driver.findElement(navbar);
	
}



}
