package automationpractice.POMworkshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
	
	public WebDriver driver; //check me

	Homepage hp;
	ProductPage pp;
	Checkout co;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		hp = new Homepage(driver);
		pp = new ProductPage(driver);
		co = new Checkout(driver);
	}
	
	@Test
	public void test1_openurl() throws InterruptedException {
		hp.openurl();
		hp.getproduct();
	}
	
	@Test
	public void test2_getproduct() throws InterruptedException {
		pp.productselect();
		pp.proceedtocart();
	}
	
	@Test
	public void test3_checkout() throws InterruptedException {
		co.login();
		co.proceedtocheckout();
		co.confirmorder();
	}
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
		}

}
