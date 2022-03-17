package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage  extends GeneralActions{
    //wyswietla 2 znaczniki
    private static final By addToCartButton6 = new By.ByXPath("//a[contains(@data-id-product,6)]/span[contains(text(),'Add to cart')]");
    private static final By addToCartButton6working = new By.ByXPath("//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[1]/span");
    private static final By proceedToCheckoutButton = new By.ByXPath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    private WebDriver driver;



    public MainPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }



    public void addToCart6(){
        scrollToElement(addToCartButton6working);
        click(addToCartButton6working);

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        click(proceedToCheckoutButton);
    }
}
