package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import AmazonTest.AmazonHomePage;

public class AmazonSignin extends AmazonHomePage{
	
	public WebDriver driver;
    public AmazonSignin(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
     
        public void Amazonlogin() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
            driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(prop.getProperty("password"));
            driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
            
     }

}
