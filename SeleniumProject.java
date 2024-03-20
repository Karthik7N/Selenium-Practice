package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject 
{

	public static void main(String[] args) 
	{

	        System.setProperty("webdriver.chromedriver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();		    
		    driver.get("http://lights.qedgetech.com/");
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.findElement(By.name("email")).sendKeys(nagulagani.karthik@gmail.com);
		    driver.findElement(By.name("password")).sendKeys(Demo@7);
		    driver.findElement(By.xpath("//button [@type = 'submit']")).click();
		    

			

		
	}

}
