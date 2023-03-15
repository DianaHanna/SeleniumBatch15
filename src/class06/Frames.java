package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        // switch to the iframe which contains the input box
        // method: byIndex
        driver.switchTo().frame(0);
        // this statement will shift the focus to the first frame
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("abracadabra");
        // get the text click on from parent window
        driver.switchTo().defaultContent();
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("The text is "+text.getText());

        // get the text
        driver.switchTo().frame("iframe_a");

        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is "+getLabel.getText());

        // switch the focus to the main page
        driver.switchTo().defaultContent();

        // clear whatever is written in the textBox
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();

    }
}
