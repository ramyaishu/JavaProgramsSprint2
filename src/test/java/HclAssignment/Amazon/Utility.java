package HclAssignment.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends BaseClass
{
    public WebDriverWait wait;

    public Utility()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void waitTimes(long time)
    {
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
    public void webDiverWait(String element)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element))).click();
    }
}
