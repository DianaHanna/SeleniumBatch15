package Class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Daniel");
        driver.findElement(By.name("lastname")).sendKeys("Abdelshahid");
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        driver.findElement(By.id("password_step_input")).sendKeys("Dany123");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.className("_8idr img")).click();
        driver.close();
        driver.quit();
    }
}