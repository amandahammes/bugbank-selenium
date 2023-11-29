package Tasks;

import PageObjects.LoginPage;
import Validations.HomeValidation;
import Validations.LoginValidation;
import Validations.RegisterValidation;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;
    private LoginValidation loginValidation;
    private RegisterValidation registerValidation;
    private HomeValidation homeValidation;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
        registerValidation = new RegisterValidation(this.driver);
        homeValidation = new HomeValidation(this.driver);
    }

    public void efetuarLogin(String user, String password){
        loginValidation.validationLoginPage();
        loginPage.getUserNameTextField().sendKeys(user);
        loginPage.getPasswordTextField().sendKeys(password);
        loginPage.getLoginButton().click();
        homeValidation.validationHomePage();
    }
    public void irPaginaCadastro() {
        loginPage.getRegisterButton().click();
        registerValidation.validationRegisterPage();
    }
}
