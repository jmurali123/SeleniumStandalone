package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTest3 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(); //upcasting from firefox obj to super type

        driver.get("C:/Users/Yashica/Desktop/Seleniumjars/Group.html");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
       // Thread.sleep(3000);

        Select course= new Select(driver.findElement(By.xpath("//select[@id='Courses']")));
        course.selectByIndex(2);
        course.selectByVisibleText("Core Java");
        course.selectByValue("Selenium");
        course.deselectAll();

       boolean t= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isEnabled();
       System.out.println(t);
      // driver.switchTo().frame(0);// index
      //  driver.switchTo().frame("test1"); // name
    //    driver.switchTo().frame("idframe"); // id
        driver.switchTo().frame(driver.findElement(By.id("idframe"))); // webelement
       driver.findElement(By.xpath("//form[@id='mc4wp-form-2']/div/input[@name='EMAIL']")).sendKeys("test@gmail.com");
       driver.switchTo().defaultContent(); // parent

       driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
       driver.findElement(By.cssSelector("#source")).clear();
     //  driver.findElement(By.cssSelector("#source")).sendKeys("Source");

       WebElement src=driver.findElement(By.cssSelector("#source"));
       Actions actions=new Actions(driver);
       actions.moveToElement(src);
       actions.keyDown(src,Keys.SHIFT);
       actions.sendKeys("Selenium");
       actions.keyUp(Keys.SHIFT);
       actions.build().perform();

//       actions.moveToElement(src);
//       actions.sendKeys(Keys.TAB);
//       actions.sendKeys("Testing");
//       actions.build().perform();

       actions.keyDown(Keys.CONTROL).sendKeys("a");
       actions.keyUp(Keys.CONTROL);
       actions.keyDown(Keys.CONTROL).sendKeys("x");
       actions.keyUp(Keys.CONTROL);

       WebElement dest= driver.findElement(By.cssSelector("#destination"));
       actions.moveToElement(dest);
       actions.click();

       actions.keyDown(Keys.CONTROL).sendKeys("v");
       actions.keyUp(Keys.CONTROL);
       actions.build().perform();

        actions.moveToElement(dest);
        actions.contextClick().perform();
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.)

    }
}
