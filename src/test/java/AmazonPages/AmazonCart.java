package AmazonPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import AmazonTest.AmazonHomePage;

public class AmazonCart extends AmazonHomePage{
	

	
	public WebDriver driver;
    public AmazonCart(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
	
    }
    
    public void AmazonCartPage()  {
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[4]/div[1]/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        test.log(LogStatus.FAIL, "AmazonPrime Failed");
        
    }
}
