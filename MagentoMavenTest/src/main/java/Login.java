

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By email=By.id("email");
	By pass= By.id("pass");
	By li=By.id("send2");
	
	public void ipemail(String e) {
		driver.findElement(email).sendKeys(e);
	}
	public void ippass(String p) {
		driver.findElement(pass).sendKeys(p);
	}
	public void li() {
		driver.findElement(li).click();
	}
}
