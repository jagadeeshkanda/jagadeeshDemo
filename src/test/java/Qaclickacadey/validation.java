package Qaclickacadey;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
//import Pageobjects.Loginpage;
import Pageobjects.Subscribe;
import resources.Base;

public class validation extends Base {
	
	@Test
	public void basepagenavigation() throws IOException {
		
		driver = instlalizeDriver();
		Subscribe No= new Subscribe(driver);
		No.subscribtion().click();
		Loginpage gettile=new Loginpage(driver);
		System.out.println(gettile.gettitle().getText());
		Assert.assertEquals(gettile.gettitle().getText(), "FEATURED COURSES");
		System.out.println(gettile.navigationbar().getText());
		Assert.assertEquals(gettile.gettitle().getText(), "FEATURED COURSES");
		
		
		driver.close();
		
	}

}
