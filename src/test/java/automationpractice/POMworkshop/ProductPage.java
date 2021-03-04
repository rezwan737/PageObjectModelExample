package automationpractice.POMworkshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void productselect() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		//switch to iframe(popup box)
		Thread.sleep(2000);
		driver.findElement(By.id("quantity_wanted")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("quantity_wanted")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); //switch to default iframe		
	}
	
	public void proceedtocart() {
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	}

}
