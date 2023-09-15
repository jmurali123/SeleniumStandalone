package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecTest1 {

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://automationzone.in/my-account/");
        WebElement ele=driver.findElement(By.cssSelector("#mf-newsletter-popup>div+div>a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        ele.click();
        driver.findElement(By.id("menu-extra-login")).click();
        RemoteWebDriver r= (RemoteWebDriver) driver;
        r.executeScript("document.getElementById(\"username\").value=\"jmurali\" ");
        WebElement password=driver.findElement(By.id("password"));
        Point p= password.getLocation();
        int y=p.getY();
        String scp="window.scrollTo(0,"+y+")";
      //  r.executeScript(scp);
        r.executeScript("arguments[0].scrollIntoView(true);",password);
        r.executeScript("arguments[0].value=\"jmurali\";",password);
    }
}
