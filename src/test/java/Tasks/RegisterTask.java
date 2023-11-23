package Tasks;

import PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterTask {
    private WebDriver driver;
    private RegisterPage registerPage;

    public RegisterTask(WebDriver driver, RegisterPage registerPage) {
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
    }

    public void cadastrarUsuarioUm(){
        registerPage.getEmailTextField().sendKeys();
    }
}
