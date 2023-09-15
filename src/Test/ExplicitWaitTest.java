package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(); //upcasting from firefox obj to super type
        // FirefoxDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://automationzone.in/");

        String title=driver.getTitle();
        System.out.println("Title of the page "+ title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Date d1= new Date();
        long starttime=d1.getTime();
        WebDriverWait wait=new WebDriverWait(driver,15);

        try{
           // ExpectedConditions.
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("#mf-newsletter-popupp>div+div>a"))));
           // WebElement ele=driver.findElement(By.cssSelector("#mf-newsletter-popupp>div+div>a"));
          //  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        //    ele.click();
        }
        catch(Exception e){
            Date d2=new Date();
            long endtime=d2.getTime();
            long totalwait=endtime-starttime;
            System.out.println(totalwait);
        }


    }
}
