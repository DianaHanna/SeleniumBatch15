package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        // connect to the web-driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create instance of the WebDriver
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://google.com");
        // maximize the window
        driver.manage().window().maximize();
        // full screen
        driver.manage().window().fullscreen();

    }
}
