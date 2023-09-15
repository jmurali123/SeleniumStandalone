package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumActions2 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement srclnk=driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions= new Actions(driver);
        actions.contextClick(srclnk).perform();

      //  driver.findElement(By.cssSelector(".context-menu-icon-copy")).click();
        actions.moveToElement(driver.findElement(By.cssSelector(".context-menu-icon-copy"))).click();
        actions.build().perform();

        driver.switchTo().alert().accept(); // this is to click ok button in the alert



        WebElement dbutton= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.moveToElement(dbutton);
        actions.doubleClick(dbutton).build().perform();

        driver.switchTo().alert().accept();

        driver.quit();





    }
}
