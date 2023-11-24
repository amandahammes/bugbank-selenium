package Tasks;

import PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterTask {
    private WebDriver driver;
    private static RegisterPage registerPage;

    public RegisterTask(WebDriver driver) {
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
    }

    public static void cadastrarUsuario(String email, String name, String password, String passwordConfirmation){
        registerPage.getEmailTextField().sendKeys(email);
        registerPage.getUserNameTextField().sendKeys(name);
        registerPage.getPasswordTextField().sendKeys(password);
        registerPage.getPasswordValidationTextField().sendKeys(passwordConfirmation);
        verificarBotaoSaldo();
        registerPage.getSubmitButton().click();
    }

    public static void verificarBotaoSaldo(){
        WebElement saldo = registerPage.getBalanceStatusToggleField();
        boolean currentState = saldo.isSelected();
        if (!currentState)
            saldo.click();
    }


}
