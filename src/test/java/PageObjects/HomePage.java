package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private Waits wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getSaldoTextField(){
        return wait.visibilityOfElement(By.id("textBalance"));
    }

    public WebElement getBankAccountNumberField() {
        return wait.visibilityOfElement(By.id("textAccountNumber"));
    }


}
