package Qaclickacadey;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import Pageobjects.Loginpage1;
import Pageobjects.Subscribe;
import resources.Base;

public class Homepage extends Base {
	
	@Test(dataProvider="getData")
	
	public void basepagenavigation(String username,String password) throws IOException, InterruptedException {
		driver=instlalizeDriver();
		driver.navigate().to("http://www.qaclickacademy.com/");   
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		Subscribe No= new Subscribe(driver);
	No.subscribtion().click();
	
	Loginpage log=new Loginpage(driver);
	log.login().click();
	System.out.println(driver.getTitle());
	
	Loginpage1 login=new Loginpage1(driver);
	login.Email().sendKeys(username);
	//System.out.println(username);
    login.Password().sendKeys(password);
    //System.out.println(password);
    login.Login().click();
	
    
	}
@DataProvider
public Object[][] getData() {
	Object [][] data=new Object[2][2];
	data[0][0]="jagadeesh.com";
	data[0][1]="Kpinku99%";
	data[1][0]="pinku.com";
	data[1][1]="Kpinku99";
	return data;
	
}


	
	
	
}
