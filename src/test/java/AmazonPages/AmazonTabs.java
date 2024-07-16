package AmazonPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.LogStatus;

import AmazonTest.AmazonHomePage;



public class AmazonTabs extends AmazonHomePage{
	
	public WebDriver driver;
    public AmazonTabs(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    
    
    public void AmazonBooks()  {
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[1]/div[1]/a[5]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);        
        test.log(LogStatus.PASS, "AmazonBooks button clicked successfully");
        
    }
     
    public void AmazonNewReleases()  {
        driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        test.log(LogStatus.PASS, "AmazonNewReleases button clicked successfully");



       }
    
    
    public void AmazonCustomerService()  {
        driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
        test.log(LogStatus.PASS, "Amazon Customer Service button clicked successfully");
    }
    
   
    public void AmazonMobiles() {
    	driver.findElements(By.xpath("//a[contains(text(),'Mobiles')]"));
    	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
    	test.log(LogStatus.PASS, "Amazon Mobiles button clicked successfully");
    }
    
   
    public void AmazonElectronics() {
    	
    	driver.findElements(By.xpath("//a[contains(text(),'Electronics')]"));
    	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
    	test.log(LogStatus.PASS, "Amazon Electronics button clicked successfully");
    }
    

    public void AmazonTodaysDeals() {
    	
    	driver.findElements(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
    	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
    	test.log(LogStatus.PASS, "Amazon Today's Deals button clicked successfully");
    }
    
    public void AmazonBestSellers()  {
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        test.log(LogStatus.PASS, "AmazonBestSellers button clicked successfully");



       }
    
    public void AmazonFashion()  {
        driver.findElement(By.xpath("//a[contains(text(),'Fashion')]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        test.log(LogStatus.PASS, "AmazonFashion button clicked successfully");
        
        
    }
    
    public void AmazonReturnsandOrders() {
    	
    	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[3]/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        test.log(LogStatus.PASS, "AmazonReturnsandOrders button clicked successfully");
        
    	
    }
    
    
	
	
}
