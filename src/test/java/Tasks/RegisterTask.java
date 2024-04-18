package Tasks;

import PageObjects.RegisterPage;
import Validations.RegisterValidation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterTask {
    private WebDriver driver;
    private RegisterPage registerPage;
    private RegisterValidation registerValidation;

    public RegisterTask(WebDriver driver) {
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
        registerValidation = new RegisterValidation(this.driver);
    }

    public void cadastrarUsuario(String email, String name, String password) throws InterruptedException {
        registerPage.getEmailTextField().sendKeys(email);
        registerPage.getUserNameTextField().sendKeys(name);
        registerPage.getPasswordTextField().sendKeys(password);
        registerPage.getPasswordValidationTextField().sendKeys(password);
        Thread.sleep(3000);
        registerPage.getBalanceStatusToggle().click();
        Actions actions = new Actions(driver);
        actions.moveToElement(registerPage.getSubmitButton()).click().perform();
        registerValidation.validationRegisterNewAccount();
        registerPage.getCloseButtonModal().click();
    }
}
