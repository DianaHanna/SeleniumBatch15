package Class08HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.linkText("PIM")).click();

        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tR/td[2]"));
        for (int i = 0; i < column.size(); i++) {
            String text = column.get(i).getText();
            if (text.equalsIgnoreCase("52384A")) {
                System.out.println(text);
                System.out.println(text+" is located in the list at index " + i);

                System.out.println("Person is located in the table at index "+(i+1));

                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[2]")).click();
            }
        }
    }
}
