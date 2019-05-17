package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public static WebDriver driver;
	  public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException {
		
		
		prop=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Sonal Patel\\MavenJava\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		
		}else if(browserName.equals("Firefox")) {
			driver=new FirefoxDriver();
			//firefox code
			
		}
		else if(browserName.equals("IE")){
			
			//IE code
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		return driver;
	
	
	}
	
	
}
