package AmazonTest;

import org.testng.annotations.Test;

import AmazonPages.AmazonCart;

public class AmazonCartTest extends AmazonHomePage{
	
    @Test
    public void AmazonCart()  {
    	AmazonCart obj = new AmazonCart(driver);
    	obj.AmazonCartPage();

    }
}
