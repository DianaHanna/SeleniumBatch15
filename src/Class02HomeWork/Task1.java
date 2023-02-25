package Class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WebDriver

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Diana");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Hanna");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Main street");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Raleigh");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("NC");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("27609");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.ssn")).sendKeys("987654321");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("DianaHanna");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("Main123");
        Thread.sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("Main123");
        Thread.sleep(000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
