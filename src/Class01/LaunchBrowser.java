package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webDriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WebDriver

        WebDriver driver=new ChromeDriver();

        // open the Website google.com

        driver.get("https://www.facebook.com/login/");

        // get the current url that is there in the browser
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        // get the title of the webPage
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        // slow down for 3 seconds
        Thread.sleep(3000);

        // close the browser
        driver.quit();

    }
}
