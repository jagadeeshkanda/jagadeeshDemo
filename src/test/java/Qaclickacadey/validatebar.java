package Qaclickacadey;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import Pageobjects.Subscribe;
import resources.Base;

public class validatebar extends Base {
	
	@Test
	
	public void validationbar() throws IOException {
	
	driver = instlalizeDriver();
	Subscribe No= new Subscribe(driver);
	No.subscribtion().click();
	Loginpage LP=new Loginpage(driver);
	Assert.assertTrue(LP.navigationbar().isDisplayed());
	System.out.print(LP.navigationbar().getText());
	System.out.println("New branch");

	}
}
