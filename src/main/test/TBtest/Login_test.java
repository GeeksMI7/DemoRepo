package TBtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TBpages.Login_page;
import baselibrary.BaseLibrary;

public class Login_test extends BaseLibrary {

	//Login_page ob;	
	// Sequence of annotation is :
/*
 * @beformethod
 * @Test -1
 * @aftermethod
 * 
 * @beformethod
 * @Test -2
 * @aftermethod
 */
	
	//WebDriver driver;
	
	@BeforeTest 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BizBrolly\\eclipse-workspace\\First_framework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//ob=new Login_page();
	}
	
	@Test
	public void googleTitletest() {
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googlelogotest() {
		
		boolean b=driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 */
}
