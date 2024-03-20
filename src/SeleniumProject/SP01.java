package SeleniumProject;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

import jdk.internal.org.jline.terminal.MouseEvent.Button;


public class SP01 {
    public static void main(String[] args) throws InterruptedException {
        // Your code that may throw InterruptedException
        // ...
    


//public class SP01 extends SeleniumProject {

//		public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		  WebDriver driver = new ChromeDriver();
//		  driver.get("http://www.bookmyshow.com");
		 
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new  ChromeDriver();
//		driver.get("http://www.google.com");
		
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("http://www.gmail.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.findElement(By.linkText("Help")).click();
//		driver.close();
//		driver.quit();
			
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("http://gmail.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.findElement(By.linkText("Help")).click();
//		driver.close();
//		driver.quit();
		
//		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("http://gmail.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.findElement(By.linkText("Help")).click();
//		driver.close();
//		driver.quit();
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://gmail.com");
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.navigate().back();
//			driver.navigate().forward();
//			driver.navigate().refresh();
//			driver.findElement(By.linkText("Help")).click();
//			driver.close();
//			driver.quit();
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			
//			driver.get("http://google.com");
//			driver.findElement(By.linkText("Images")).click();
//			String pgtitle = driver.getTitle();
//			System.out.println(pgtitle);		
			
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("http://google.com");
			
//			driver.get("http://primusbank.qedgetech.com");			
//			driver.get("http://facebook.com");
//			driver.findElement(By.linkText("Careers")).click();
//			String pgo = driver.getTitle();
//			System.out.println(pgo);
//			driver.getTitle();
//			String pgurl = driver.getCurrentUrl();
//			System.out.println(pgurl);
//			driver.findElement(By.linkText("Site Map")).click();
//			driver.findElement(By.linkText("About Us")).click();
//			driver.findElement(By.linkText("Contact Usa")).click();
//			List<WebElement> links = driver.findElements(By.linkText("Home"));
//			System.out.println(links.size());
//			links.get(1).click();
//			List<WebElement> links = driver.findElements(By.linkText("About Us"));
//			System.out.println(links.size());
//		    links.get(1).click();
//			List<WebElement> links = driver.findElements(By.tagName("a"));
//			System.out.println(links.size());			
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("http://google.com");
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("https://facebook.com");
//				driver.findElement(By.id("email")).sendKeys("nagulagani.karthik@gmail.com");
//			 	driver.findElement(By.id("pass")).sendKeys("Kartheek+7777");
//			 	driver.findElement(By.id("login")).click();
			 	
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			
//			driver.get("http://google.com");
//			driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

			
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("http://bing.com");
//			driver.findElement(By.id("sb_form_q")).sendKeys("karthik nagulagani");

			

			
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			
//			driver.get("http://orangehrm.qedgetech.com");
//			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//			driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
//			WebElement login = driver.findElement(By.name("Submit"));
//			login.click();
//			
//			driver.findElement(By.partialLinkText("Welcome")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			driver.close();
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			
//			driver.get("http://flights.qedgetech.com");
//			driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("demo");
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			String pgtitle =  driver.getTitle();
//			if(pgtitle.toLowerCase().contains("dashboard"))
//			{
//				System.out.println("Login Successful, test pass");
//			}else
//			{
//				System.out.println("Login UnSuccessful, test fail");
//			}
//			
//			driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			driver.close();
			
			
		
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("http://flights.qedgetech.com");
//			driver.findElement(By.name("email")).sendKeys("nagulagani.karthik@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("Demo@7");
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			String pgtitle = driver.getTitle();
//			
//			if (pgtitle.toLowerCase().contains("dashboard"))
//			{
//				System.out.println("Login Successful, test pass");
//			}
//			else
//			{
//				System.out.println("Login unsuccessful, test fail");
//			}
////			see the video for the reff of below line => QEdge
//			driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
//			
//			driver.findElement(By.linkText("Logout")).click();
//			driver.close();
//			("//a[@href='aboutus.html']")).click();
			
			
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.get("https://www.lloydsbankinggroup.com/");
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.findElement(By.linkText("Contact")).click();
//			driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
			
			
//			System.setProperty("webdriver.chromedriver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();		    
//		    driver.get("http://flights.qedgetech.com/");
//		    driver.manage().deleteAllCookies();
//		    driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		    driver.findElement(By.name("email")).sendKeys("nagulagani.karthik@gmail.com");
//		    driver.findElement(By.name("password")).sendKeys("Demo@7");
//		    driver.findElement(By.xpath("//button [@type = 'submit']")).click();
//		    driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
//		    driver.findElement(By.linkText("Logout")).click();
//		    driver.close();
		    

//		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		    WebDriver  driver = new ChromeDriver();
//		    driver.manage().deleteAllCookies();
//		    driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		    
//		    driver.get("http://primusbank.qedgetech.com/");
//		    driver.findElement(By.xpath("//a[@href='aboutus.html']")).click();
////		    (By.xpath("//a[@href='aboutus.html']")).click();
////		    driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span/a[3]")).click();
//		    driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span/a[3]")).click();
		   
			
//			
//			System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
//			driver.get("http://snapdeal.com");
//			driver.findElement(By.id("inputValEnter")).sendKeys("phones");
//			driver.findElement(By.linkText("Search")).click();
//			driver.findElement(By.xpath("//button[@type='Search']")).click();
//		    driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/button/span")).click();

//			driver.get("http://flights.qedgetech.com");
//			driver.findElement(By.name("email")).sendKeys("nagulagani.karthik@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("Demo@7");
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			driver.findElement(By.xpath("//input[@name='price_class' and @value='Business']")).click();
			
//			driver.get("http://facebook.com");
//			List<WebElement> editlist = driver.findElements(By.xpath("//input[@type='text' or type='password']"));
//			System.out.println(editlist.size());
			

//			driver.get("http://facebook.com");
//			driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("demo");

//			driver.get("https://www.facebook.com/");
//			String x = driver.findElement(By.id("email")).getAttribute("placeholder");
//			System.out.println(x);
		    
//			driver.get("https://www.facebook.com/");
//			String x = driver.findElement(By.linkText("Create a Page")).getAttribute("href");
//			System.out.println(x);

//			driver.get("https://www.facebook.com/");
//			String fbheader =  driver.findElement(By.className("_8eso")).getText();
//			System.out.println(fbheader);
			
//			driver.get("http://twitter.com");
//			String twitterheader =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[1]/span")).getText();
//			System.out.println(twitterheader);

//			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			String link_tobe_check = "Gmail";
//			driver.get("http://google.com");
//			try {
//				if (driver.findElement(By.linkText(link_tobe_check)).isDisplayed());
//				System.out.println("test pass");
//			} catch (Exception e) 
//			{
//			System.out.println("test fail");
//			}
		
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			
//			driver.get("http://flights.qedgetech.com");
//			driver.findElement(By.linkText("Register")).click();
//			
//			WebElement element = driver.findElement(By.id("flexCheckChecked"));
//			
//			if(!element.isSelected())
//			{
//				element.click();
//			}			
			
//			driver.get("https://www.instagram.com/accounts/emailsignup/");
//			List<WebElement> editlist = driver.findElements(By.xpath("//input[@type = 'text' or type = 'number']"));
//			System.out.println(editlist.size());

			
//			driver.get("http://google.com");
//			driver.findElement(By.name("q")).sendKeys("selenium");
//			
//			Thread.sleep(2000);
//			
//			List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
//			System.out.println(keywordlist.size());
//			for(WebElement element : keywordlist)
//			{
//				String keyword = element.getText();
//				if(keyword.equalsIgnoreCase("selenium download"))
//				{
//					element.click();
//					break;
//				}
//
//			}
			 
//    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		driver.get("http://wwwfacebook.com");
//		driver.findElement(By.linkText("Create new account")).click();
//	
//		Select dlist = new Select(driver.findElement(By.id("day")));
//		dlist.selectByIndex(21);
//		
//		Select mlist = new Select(driver.findElement(By.id("month")));
//		mlist.selectByValue("5");
//		
//		Select ylist = new Select(driver.findElement(By.id("year")));
//		ylist.selectByValue("1994");
//		
//		driver.findElement(By.name("firstname")).sendKeys("Karthik");
		
//		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
//		List<WebElement> catlist = cat.getOptions();
//		System.out.println(catlist.size());
		
//		Select wlist = new Select(driver.findElement(By.id("first")));
//		wlist.click();
//		wlist.selectByIndex(2);
//		Thread.sleep(2000);
		
		
		
			
			
					
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
		
			
			
		
		
		
		
	}

}
