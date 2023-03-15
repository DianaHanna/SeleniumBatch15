package Class06HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(0);
        WebElement text=driver.findElement(By.xpath("//p[contains(text(),'goes here')]"));
        text.clear();
        text.sendKeys("Hello World!");
        driver.switchTo().defaultContent();
    }
}
