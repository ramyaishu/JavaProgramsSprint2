package HclAssignment.Amazon;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonHomePageTestCase extends BaseClass
{
    AmazonHomePage television;

    @BeforeClass
    public void init()
    {
        television= PageFactory.initElements(driver,AmazonHomePage.class);
    }
    @Test(priority = 1)
    public void title()
    {
        String title=television.getUrl();
        Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
    }
    @Test(priority = 2)
    public void checkTvRatings() throws InterruptedException
    {
        television.topRateTV();
        Assert.assertTrue(television.customerRatings.contains("202,518 ratings"));


    }
}
