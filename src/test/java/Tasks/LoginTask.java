package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void efetuarLogin(String user, String password){
        loginPage.getUserNameTextField().sendKeys(user);
        loginPage.getPasswordTextField().sendKeys(password);
        loginPage.getLoginButton().click();
    }
    public void irPaginaCadastro() {
        loginPage.getRegisterButton().click();
    }
}
