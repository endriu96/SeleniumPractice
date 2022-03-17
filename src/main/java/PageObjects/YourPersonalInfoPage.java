package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourPersonalInfoPage extends GeneralActions{

    private WebDriver driver;

    private static By mrRadioButton = new By.ByXPath("//input[contains(@type,\"radio\")][contains(@value,1)]");
    private static By mrsRadioButton = new By.ByXPath("//input[contains(@type,\"radio\")][contains(@value,2)]");
    private static By firstNameField = new By.ByXPath("//input[contains(@type,\"text\")]" +
            "[contains(@id,\"customer_firstname\")]");
    private static By lastNameField = new By.ByXPath("//input[contains(@type,\"text\")]" +
            "[contains(@id,\"customer_lastname\")]");
    private static By emailField = new By.ByXPath("//input[contains(@type,\"text\")]" +
            "[contains(@id,\"email\")]");
    private static By passwordField = new By.ByXPath("//input[contains(@type,\"password\")]" +
            "[contains(@id,\"passwd\")]");
    private static By dateOfBirthDaysSelect = new By.ByXPath("//select[contains(@id,\"days\")]");
    private static By dateOfBirthMonthsSelect = new By.ByXPath("//select[contains(@id,\"months\")]");
    private static By dateOfBirthYearsSelect = new By.ByXPath("//select[contains(@id,\"years\")]");

    public YourPersonalInfoPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public void yourPersonalInfoFilling(String firstName, String lastName,String email, String password){
        click(mrRadioButton);
        typeIn(firstName,firstNameField);
        typeIn(lastName,lastNameField);
        typeIn(email,emailField);
        typeIn(password,passwordField);
        click(dateOfBirthDaysSelect);

    }


}
