package HclAssignment.Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage
{
    WebDriver driver;
  Utility textUtilAmazon;
    WebDriverWait wait;

    public AmazonHomePage(WebDriver driver)
    {
        this.driver=driver;
        textUtilAmazon = new Utility();


    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(id = "a-autoid-0-announce")
    WebElement iconRated;
    @FindBy(id = "s-result-sort-select_3")
    WebElement menuAverageRate;
    //@FindBy(xpath = "//span[text()='Fire TV Stick 4K, brilliant 4K streaming quality, TV and smart home controls, free and live TV'][1]")
    // WebElement topRate;
    @FindBy(id = "productTitle")
    WebElement productTitle;
    @FindBy(id = "acrCustomerReviewText")
    WebElement ratings;
    String customerRatings;

    public String getUrl()
    {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public void topRateTV() throws InterruptedException {
        searchBox.sendKeys("amazon fire stick", Keys.ENTER);
        textUtilAmazon.waitTimes(10);
        iconRated.click();
        textUtilAmazon.waitTimes(10);
        menuAverageRate.click();
        Thread.sleep(1000);
        System.out.println("Top Rated tv is :");
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("arguments[0].scrollIntiView();",topRate);
        // actions.moveToElement(topRate);
        //topRate.click();
        String topRate ="//span[text()='Fire TV Stick 4K, brilliant 4K streaming quality, TV and smart home controls, free and live TV'][1]";
        textUtilAmazon.webDiverWait(topRate);
        String text = productTitle.getText();
        System.out.println(text);
        customerRatings = ratings.getText();
        System.out.println("Customers ratings of this TV : "+customerRatings);


    }
}
