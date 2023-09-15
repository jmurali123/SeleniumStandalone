package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FluentWaitTest {

    public static void main(String args[]) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //upcasting from firefox obj to super type
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://automationzone.in/");

        String title=driver.getTitle();
        System.out.println("Title of the page "+ title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Date d1= new Date();
        long starttime=d1.getTime();

        try {
            Wait wait = new FluentWait(driver)
                    .withTimeout(6, TimeUnit.SECONDS)
                    .pollingEvery(200, TimeUnit.MILLISECONDS)
                    .ignoring(NoSuchElementException.class);

            wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("#mf-newsletter-popup>div+div>a"))));

        }
        catch(TimeoutException e){
            Date d2=new Date();
            long endtime=d2.getTime();
            long totalwait=endtime-starttime;
            System.out.println(totalwait);
        }
    }
    }
