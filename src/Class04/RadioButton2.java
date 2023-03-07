package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        // find all the age group radio buttons
        // the Xpath here is common to all the WebElements that have age group
        List<WebElement> radioBtns =driver.findElements(By.xpath("//input[@name='ageGroup']"));
        // iterate over the list to see your desired one
        for (WebElement radioBtn:radioBtns) {
            String age=(radioBtn.getAttribute("value"));
            // if the value of the WebElement is 5-10 click on it
            if (age.equalsIgnoreCase("0 - 5")){
                radioBtn.click();
            }
        }
    }
}
