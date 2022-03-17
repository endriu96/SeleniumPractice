package TestDefinitions;

import PageObjects.GeneralActions;
import PageObjects.MainPage;
import PageObjects.ShoppingCartSummary;
import PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;

public class BuyOneElement  extends GeneralActions {

    private WebDriver driver;
    private MainPage mainPage;
    private ShoppingCartSummary shoppingCartSummary;
    private SignInPage signInPage;


    public BuyOneElement(WebDriver driver) {
        super(driver);
        this.driver=driver;
        mainPage  = new MainPage(driver);
        shoppingCartSummary = new ShoppingCartSummary(driver);
        signInPage = new SignInPage(driver);

    }

    public void buyElement6withNewAccount(){
            mainPage.addToCart6();
            shoppingCartSummary.clickProceedButton();
            signInPage.createAnAccountWriteEmail("endriu96@gmail.com");


    }
}
