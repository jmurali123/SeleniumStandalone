package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumActions3 {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
        WebElement ele=driver.findElement(By.cssSelector("#promtButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
        driver.findElement(By.cssSelector("#promtButton")).click();
        driver.switchTo().alert().sendKeys("Selenium Training");
        driver.switchTo().alert().accept();

    }
}
