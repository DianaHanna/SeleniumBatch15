package Class04HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean isSelectedBox=checkBox.isSelected();
        System.out.println(isSelectedBox);
        if (!isSelectedBox){
            checkBox.click();
        }
        isSelectedBox=checkBox.isSelected();
        System.out.println(isSelectedBox);
    }
}
