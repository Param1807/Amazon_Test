package AmazonTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Amazon_Test.Amazon_Testing.ExtentManager;
import Amazon_Test.Amazon_Testing.ScreenShot;

public class AmazonHomePage {
	public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    static FileInputStream fis = null;
    protected static Properties prop = new Properties();
    static {
        try {
            File file = new File("C:\\Users\\HP\\Downloads\\3191146_Paramjeet_Solanki_Selenium_Assignment\\3191146_Paramjeet_Solanki_Selenium_Assignment\\Amazon_Testing\\Resource\\config.properties");
            fis = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                }
        try {
            prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
    @BeforeSuite
    public void InitializeDriver() throws InterruptedException {
        String browser=prop.getProperty("browserName");

        if(browser.equalsIgnoreCase("Chrome")) {
            System.setProperty(prop.getProperty("driver"),prop.getProperty("driverpath"));
            driver = new ChromeDriver();
            }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        extent= ExtentManager.getInstance("./Reports/extentReports.html");

        }
    @BeforeMethod
    public void beforeTestCase(Method method) {
        test=extent.startTest(method.getName());
    }
    @Test
    public void openUrl() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        Thread.sleep(5000);
        String text = driver.getTitle();
        Assert.assertEquals(text,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        System.out.println("Homepage Opened");
    }
    @AfterMethod
    public void status(ITestResult result) {
        if(result.getStatus()==ITestResult.SUCCESS)
            test.log(LogStatus.PASS, "Test case got passed");
        else if(result.getStatus()==ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
            ScreenShot.screenshot(driver, result.getTestName());
        }
        else if(result.getStatus()==ITestResult.SKIP)
            test.log(LogStatus.SKIP, result.getThrowable());
        extent.flush();
    }
    @AfterSuite
    public void quitBrowser() {
        driver.quit();
    }
	

}
