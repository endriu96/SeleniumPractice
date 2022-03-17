package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends GeneralActions{

    private WebDriver driver;

        private static final By createAccountField= new By.ByXPath("//input[contains(@type,\"text\")]" +
                "[contains(@id,\"email_create\")]");
        private static final By createAccountButton = new By.ByXPath("//span//i" +
                "[contains(@class,\"icon-user left\")]");

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public void  createAnAccountWriteEmail(String inputEmailText){
            typeIn(inputEmailText,createAccountField);
            click(createAccountButton);

        }

}
