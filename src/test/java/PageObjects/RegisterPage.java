package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private WebDriver driver;
    private Waits wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getEmailTextField() {
        return wait.visibilityOfElement(By.xpath("//div[@class='card__register']//input[1]"));
    }
    public WebElement getUserNameTextField() {
        return wait.visibilityOfElement(By.xpath("//input[@placeholder='Informe seu Nome']"));
    }
    public WebElement getPasswordTextField() {
        return wait.visibilityOfElement(By.cssSelector(".login__password:nth-child(4) .input__default"));
    }
    public WebElement getPasswordValidationTextField() {
        return wait.visibilityOfElement(By.cssSelector(".login__password:nth-child(5) .input__default"));
    }
    public WebElement getBalanceStatusToggleField() {
        return wait.visibilityOfElement(By.id("toggleAddBalance"));
    }
    public WebElement getSubmitButton() {
      return wait.visibilityOfElement(By.cssSelector(".CMabB"));
    };
    public WebElement getModalTextField() {
        return wait.visibilityOfElement(By.id("modalText"));
    }
    public WebElement getCloseButtonModal() {
        return wait.visibilityOfElement(By.id("btnCloseModal"));
    }

}
