package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public WebDriver driver1;
	public WebDriver instlalizeDriver() throws IOException {
		Properties prop= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\jagadeesh\\Maveenjva\\src\\main\\java\\resources\\data.properties");
		prop.load(file);
	String browsername=	prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E://Java//chromedriver_win32 (1)//chromedriver.exe");
			driver=new ChromeDriver();
                String website=prop.getProperty("url");
                driver.get(website);

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
