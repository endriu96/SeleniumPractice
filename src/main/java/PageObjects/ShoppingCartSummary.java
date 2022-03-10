package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummary extends GeneralActions{
    private static final By proccedToCheckoutButton = new By.ByXPath("//*[@id=\"center_column\"]/p[2]/a[1]/span");

    private WebDriver driver;

    public ShoppingCartSummary(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickProceedButton(){
        click(proccedToCheckoutButton);
    }


}
