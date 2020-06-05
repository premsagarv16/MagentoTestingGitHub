import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Main {
	WebDriver driver;
	@BeforeMethod
	public void open() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
	@Test
	public void possitiveCredential()
	 {
		
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyacc();
		
		Login l = new Login(driver);
		l.ipemail("ihassan395@gmail.com");
		l.ippass("Welcome@123");
		l.li();
		
		Home h = new Home(driver);
		h.logout();
		}

}
