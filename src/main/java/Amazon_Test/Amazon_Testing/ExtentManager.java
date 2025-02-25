package Amazon_Test.Amazon_Testing;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	

    private static ExtentReports extent;
    public static ExtentReports getInstance(String filename) {
        if(extent==null) {
            extent= new ExtentReports(filename,true,DisplayOrder.NEWEST_FIRST);
            extent.loadConfig(new File(System.getProperty("user.dir")+"/REPORTCONFIG.xml"));
        }
        return extent;
    }

}
