package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleTest {
    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yashica\\Desktop\\Seleniumjars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(); //upcasting from firefox obj to super type

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement ele=driver.findElement(By.id("tinymce"));
        ((JavascriptExecutor)driver).executeScript("document.getElementById(\"tinymce\").textContent=\"Text\";");
     //   ele.sendKeys("Test");
     //   driver.findElement(By.id("tinymce")).sendKeys("Test data");
        driver.switchTo().defaultContent();
    }
}
