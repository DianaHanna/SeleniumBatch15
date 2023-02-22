package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect to webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open google.com
        driver.get("https://www.google.com");
        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // go back
        driver.navigate().back();
        // slow down
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();

        //slow down
        Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();
        // close the browser
        driver.close();
    }
}
