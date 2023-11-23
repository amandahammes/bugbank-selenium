package Framework.Browser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriveManager {

    private static WebDriver driver;

    private String URL = "https://www.saucedemo.com/";

    public static WebDriver getDriver(){
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        getDriver().get(URL);
    }

    @AfterEach
    public void finish(){
        quitDriver();
    }
}