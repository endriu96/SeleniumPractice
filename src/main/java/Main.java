import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    private static WebDriver driver;
    private  static ChromeDriver chromeDriver;

    @BeforeEach
    void init(){
    WebDriverManager.chromedriver().setup();

    }
}
