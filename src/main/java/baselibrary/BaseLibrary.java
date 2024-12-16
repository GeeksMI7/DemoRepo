package baselibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary {
	
	static public WebDriver driver;
	
	public void launchURL(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BizBrolly\\eclipse-workspace\\First_framework\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}
}
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
