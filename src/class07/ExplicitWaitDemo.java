package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        // implement the explicit wait
        WebDriverWait wait=new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText= text.getText();
        System.out.println(WelcomeText);

    }
}
