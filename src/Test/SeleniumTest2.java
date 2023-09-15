package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest2 {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(); //upcasting from firefox obj to super type
        // FirefoxDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://automationzone.in/");
        String title=driver.getTitle();
        System.out.println("Title of the page "+ title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(5000);
        WebElement ele=driver.findElement(By.cssSelector("#mf-newsletter-popup>div+div>a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        ele.click();
        // driver.findElement(By.cssSelector("#mf-newsletter-popup>div+div>a")).click();
        driver.findElement(By.cssSelector(".extras-menu>li+li+li")).click();
        driver.findElement(By.xpath("//*[@class='martfury-login-tabs']//a[text()='Register']")).click();
     //   WebElement ele1=driver.findElement(By.xpath("//div[@class='martfury-login-tabs']"));
     //   ele1.findElement(By.xpath("//a[text()='Register']")).click();

        Thread.sleep(5000);
    }
}
