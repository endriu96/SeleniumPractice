package TestDefinitions;

import PageObjects.GeneralActions;
import PageObjects.MainPage;
import PageObjects.ShoppingCartSummary;
import org.openqa.selenium.WebDriver;

public class BuyOneElement  extends GeneralActions {

    private WebDriver driver;
    private MainPage mainPage;
    private ShoppingCartSummary shoppingCartSummary;


    public BuyOneElement(WebDriver driver) {
        super(driver);
        this.driver=driver;
        mainPage  = new MainPage(driver);
        shoppingCartSummary = new ShoppingCartSummary(driver);
    }

    public void buyElement6(){
            mainPage.addToCart6();
            shoppingCartSummary.clickProceedButton();

    }
}
