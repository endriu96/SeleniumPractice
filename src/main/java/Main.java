import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Main {


    private static WebDriver driver;
    private  static ChromeDriver chromeDriver;
    private static ChromeOptions chromeOptions;

    @BeforeEach
    void init(){

        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/browser/navigation/");
        driver.getTitle();
        /*
        To make sure element is on webpage before we interract with it.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));




    }


    @Test
    void  run(){

        driver.getCurrentUrl();
        //strzałka do tyłu
        driver.navigate().back();
        //Strzałka do przoud
        driver.navigate().forward();

        //Click the link to activate the alert
   //     driver.findElement(By.linkText("See an example alert")).click();

//Wait for the alert to be displayed and store it in a variable
      //  Alert alert = wait.until(ExpectedConditions.alertIsPresent());

//Store the alert text in a variable
     //   String text = alert.getText();

//Press the OK button
    //    alert.accept();

        //Store the web element
        WebElement iframe = driver.findElement(By.cssSelector("#modal>iframe"));
        //Switch to the frame
        driver.switchTo().frame(iframe);

//Now we can click the button
        driver.findElement(By.tagName("button")).click();
        // Return to the top level
        driver.switchTo().defaultContent();

    }



    @Test
    void runWindowsTest(){
        //Tworzy zmienną która focusuje strone główną
        String originalWindow = driver.getWindowHandle();
        driver.manage().window().fullscreen();
        //Otwiera nową zakładke
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/documentation/webdriver/elements/");
        //Wraca do strony głównej
        driver.switchTo().window(originalWindow);
        driver.close();
        driver.quit();
    }
}
