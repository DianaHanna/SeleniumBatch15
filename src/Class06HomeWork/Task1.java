package Class06HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        driver.findElement(By.xpath("//div[@id='finish']")).click();

        WebElement text= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        String DisplayedText=text.getText();
        if (text.isDisplayed()){
            System.out.println("Text is displayed: "+DisplayedText);
        }else {
            System.out.println("Something is wrong with the text");
        }
    }
}
