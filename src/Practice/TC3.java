package Practice;

import Class01.Maximize;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        String URL=driver.getCurrentUrl();
        if (URL.contains("facebook")){
            System.out.println("URL contains facebook");
        }else {
            System.out.println("URL doesn't contain facebook");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
