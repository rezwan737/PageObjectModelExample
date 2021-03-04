package automationpractice.POMworkshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abcd@qa.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("asdasd"); //i/i[contains(text(),'Sign in')]
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
	}
	
	public void proceedtocheckout() throws InterruptedException{
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uniform-cgv")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cheque")).click();
	}
	
	public void confirmorder() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	}

}
