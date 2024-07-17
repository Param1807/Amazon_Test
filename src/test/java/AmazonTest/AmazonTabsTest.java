package AmazonTest;

import org.testng.annotations.Test;

import AmazonPages.AmazonTabs;

public class AmazonTabsTest extends AmazonHomePage{
	

    @Test
    public void Amazontext()  {
    	AmazonTabs x3 = new AmazonTabs(driver);
        x3.AmazonBooks();
        x3.AmazonCustomerService();
        x3.AmazonMobiles();
        x3.AmazonElectronics();
        x3.AmazonTodaysDeals();
        x3.AmazonBestSellers();
    }
	

}
