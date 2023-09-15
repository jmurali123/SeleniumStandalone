package Test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SeleniumTest {

    public static void main(String args[]) throws InterruptedException, IOException {
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(); //upcasting from firefox obj to super type
       // FirefoxDriver driver=new FirefoxDriver();
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
        driver.findElement(By.cssSelector("#username")).sendKeys("jmurali");
        driver.findElement(By.cssSelector("#password")).sendKeys("Muralij@2023$08");
        driver.findElement(By.cssSelector("button[name='login']")).click();

        //Typecasting the driver object to TakesScreenshot interface
        TakesScreenshot ts=(TakesScreenshot) driver;

        //getting the source file using getScreenshot method and storing it in a file
        File srcFile=ts.getScreenshotAs(OutputType.FILE);

        Date d= new Date();
        String date1=d.toString();
        System.out.println(date1);
        String date2=date1.replaceAll(":","_");
        System.out.println(date2);

        File destFile= new File(".\\screenshot\\"+date2+"_automationzone.png");

        FileUtils.copyFile(srcFile,destFile);

        driver.close();





    }

}
