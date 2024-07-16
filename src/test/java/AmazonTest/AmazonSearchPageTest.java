package AmazonTest;

import org.testng.annotations.Test;

import AmazonPages.AmazonSearchPage;

public class AmazonSearchPageTest extends AmazonHomePage{
	

    @Test
    public void searching() throws InterruptedException {
        AmazonSearchPage x1 = new AmazonSearchPage(driver);
        x1.AmazonSearch();



   }

}
