package PageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GeneralActions {

    protected WebDriver driver;
    private Actions action;
    private int MAXWAIT = 10000;
    private int WAITTICKSIZE = 100;

    public GeneralActions(WebDriver driver){
            this.driver= driver;
            action = new Actions(driver);

    }

    protected  void doubleClick(By element) throws InterruptedException {
        waitFor(element);
        driver.findElement(element).click();
        driver.findElement(element).click();
        //     action.doubleClick();
    }

    protected void typeIn (String input, By element){
        waitFor(element);
        driver.findElement(element).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"));
        driver.findElement(element).sendKeys(Keys.DELETE);
        driver.findElement(element).sendKeys(input);
    }


    void hoverOver(By element) {
        action.moveToElement(driver.findElement(element)).moveToElement(driver.findElement(element));
    }

    protected void click(By element){
        waitFor(element);
        driver.findElement(element).click();
    }

    protected boolean isPresent(By element){
        return (driver.findElements(element).size()>0);
    }

    protected void verifyPresence(By element){
        Assertions.assertTrue(isPresent(element), "Element "+element.toString() +"not found");
    }

    protected void waitFor(By element){
        int wait=MAXWAIT;
        if (driver.findElements(element).isEmpty())
            while (driver.findElements(element).size()<1 && wait >0)
            {
                try {
                    Thread.sleep(WAITTICKSIZE);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                wait-=WAITTICKSIZE;
            }
        verifyPresence(element);
    }

    public void scrollToElement(By element){
        WebElement webElement = driver.findElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);

    }



    public void goToEnd(){
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Url
            driver.get("https://google.com");

            // Enter "webdriver" text and perform "ENTER" keyboard action
            driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);

            Actions actionProvider = new Actions(driver);
            Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
            keydown.perform();
        } finally {
            driver.quit();
        }
    }


}
