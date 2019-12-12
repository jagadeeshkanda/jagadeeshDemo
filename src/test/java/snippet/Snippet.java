package snippet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import resources.Base;

public class Snippet extends Base {
	
	

	public void getscrren() throws IOException {
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
			FileUtils.copyFile(src,new File("D://screenshot.png"));
	
		 
	}

	
	
}

