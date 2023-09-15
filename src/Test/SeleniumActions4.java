package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumActions4 {

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement from=driver.findElement(By.xpath("//li[@id='credit2']"));
        WebElement to=driver.findElement(By.xpath("//ol[@id='bank']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",to);
      //  RemoteWebDriver rdriver=(RemoteWebDriver)driver;
      //  rdriver.executeScript("arguments[0].scrollIntoView(true);",to);
        Actions actions= new Actions(driver);
        actions.clickAndHold(from).moveToElement(to).release(to);
      //  actions.dragAndDrop(from,to);
        actions.build().perform();

    }
}
