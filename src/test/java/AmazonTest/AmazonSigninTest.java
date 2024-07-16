package AmazonTest;

import org.testng.annotations.Test;

import AmazonPages.AmazonSignin;

public class AmazonSigninTest  extends AmazonHomePage{
	

    @Test
    public void Amazonlogin() throws InterruptedException {
        AmazonSignin x2 = new AmazonSignin(driver);
        x2.Amazonlogin();
    }
	
}
