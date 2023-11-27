package Tasks;

import PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterTask {
    private WebDriver driver;
    private RegisterPage registerPage;
    private String modalText;
    private String accountNumber;
    private String accountDigit;

    public RegisterTask(WebDriver driver) {
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
    }

    public void cadastrarUsuario(String email, String name, String password) throws InterruptedException {
        registerPage.getEmailTextField().sendKeys(email);
        registerPage.getUserNameTextField().sendKeys(name);
        registerPage.getPasswordTextField().sendKeys(password);
        registerPage.getPasswordValidationTextField().sendKeys(password);
        Thread.sleep(3000);
        registerPage.getBalanceStatusToggle().click();
        registerPage.getSubmitButton().click();
        registerPage.getCloseButtonModal().click();
    }

    public void limparCadastroUsuario(){
        registerPage.getEmailTextField().clear();
        registerPage.getUserNameTextField().clear();
        registerPage.getPasswordTextField().clear();
        registerPage.getPasswordValidationTextField().clear();
    }
}
