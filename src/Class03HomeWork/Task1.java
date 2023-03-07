package Class03HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // open syntaxtechs.net
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        // find the username
        WebElement message =driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("Hello World");
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
       showMessage.click();

       WebElement aValue=driver.findElement(By.xpath("//input[@id='sum1']"));
       aValue.sendKeys("50");

       WebElement bValue=driver.findElement(By.xpath("//input[@id='sum2']"));
       bValue.sendKeys("100");

       WebElement getTotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
       getTotal.click();

        System.out.println(getTotal.getAttribute("type"));
}
}
