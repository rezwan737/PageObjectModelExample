package automationpractice.POMworkshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void openurl() throws InterruptedException {
		driver.get("http://automationpractice.com/");
		Thread.sleep(2000);
	}
	
	public void getproduct() throws InterruptedException {
		driver.findElement(By.className("sf-with-ul")).click();
		Thread.sleep(2000);
	}
	
}
