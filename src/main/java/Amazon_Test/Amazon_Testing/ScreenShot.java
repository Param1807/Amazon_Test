package Amazon_Test.Amazon_Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

    public static void screenshot(WebDriver driver,String filename) {
        String screenshotFileName=System.getProperty("user.dir")+"\\"+filename+".png";
        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcfile, new File(screenshotFileName));
        }
        catch(IOException e) {
        }
    }
	
	

}
