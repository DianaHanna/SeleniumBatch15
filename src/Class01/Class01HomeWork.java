package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01HomeWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // launch the browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        // navigate to amazon web site
        driver.navigate().to("https://www.amazon.com/");
        // print out the title and the url in the console
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        // close the browser
        driver.close();

    }
}
