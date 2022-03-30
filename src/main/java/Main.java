import PageObjects.GeneralActions;
import PageObjects.MainPage;
import PageObjects.ShoppingCartSummary;
import TestDefinitions.BuyOneElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;


public class Main  {


    private static WebDriver driver;
    private static MainPage mainPage;
    private static GeneralActions generalActions;
    private static ShoppingCartSummary shoppingCartSummary;
    private static BuyOneElement buyOneElement;

    private  static ChromeDriver chromeDriver;
    private static ChromeOptions chromeOptions;





        public void run(){

        }






    /*public int factorial(int a){
        if(a==0 && a==1){
            return 1;
        }else {
        }
    }
    */
   /* @Test
    public void verifyHomepageTitle() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";


        System.out.println("launching firefox browser");
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    */


        void init(){

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        buyOneElement = new BuyOneElement(driver);
        shoppingCartSummary= new ShoppingCartSummary(driver);
        generalActions = new GeneralActions(driver);
        driver.get("http://automationpractice.com/index.php");

        /*
        To make sure element is on webpage before we interract with it.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

    }

    @Test
    void run2() {
            buyOneElement.buyElement6withNewAccount();

    }




   /* @Test
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
*/


   /* @Test
    void runWindowsTest(){
        //Tworzy zmienną która focusuje strone główną
        String originalWindow = driver.getWindowHandle();
        driver.manage().window().fullscreen();
        //Otwiera nową zakładke
    //    driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/documentation/webdriver/elements/");
        //Wraca do strony głównej
       // driver.switchTo().window(originalWindow);
        driver.quit();
    }

    */
}
