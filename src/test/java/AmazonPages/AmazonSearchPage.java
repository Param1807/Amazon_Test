package AmazonPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class AmazonSearchPage {
	
	 public WebDriver driver;
	    public AmazonSearchPage(WebDriver driver){
	        PageFactory.initElements(driver, this);
	        this.driver=driver;
	    }




	    
	    public void AmazonSearch() throws InterruptedException {
	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone13");
	        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	    }
	
}
