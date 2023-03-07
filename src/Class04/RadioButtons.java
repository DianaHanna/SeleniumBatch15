package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        // click on the radio button Male
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        // check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("The radio button male is enabled "+isEnabledMale);

        // check if the radio button is Displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println(isDisplayedMale);

        // check if the radio button is Selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println(isSelectedMale);
        if (!isSelectedMale){
            maleBtn.click();
        }
        isSelectedMale=maleBtn.isSelected();
        System.out.println(isSelectedMale);
    }
}
