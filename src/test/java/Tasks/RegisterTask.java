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
    private WebElement saldo;
    private String accountNumber = "";
    private String accountDigit = "";

    public RegisterTask(WebDriver driver) {
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
    }

    public void cadastrarUsuario(String email, String name, String password){
        registerPage.getEmailTextField().sendKeys(email);
        registerPage.getUserNameTextField().sendKeys(name);
        registerPage.getPasswordTextField().sendKeys(password);
        registerPage.getPasswordValidationTextField().sendKeys(password);
        //setSaldo();
        //selecionarBotaoSaldo();
        saldo = registerPage.getBalanceStatusToggleField();
        //saldo.click();
        boolean currentState = saldo.isSelected();
        if (!currentState)
            saldo.click();

        registerPage.getSubmitButton().click();
        modalText = registerPage.getModalText().getText();
        pegarContaDigitoDoModal();
        registerPage.getCloseButtonModal().click();
    }

    public void selecionarBotaoSaldo(){
        WebElement saldo = registerPage.getBalanceStatusToggleField();
        boolean currentState = saldo.isSelected();
        if (!currentState)
            saldo.click();
    }


    public void pegarContaDigitoDoModal(){
        Pattern padrao = Pattern.compile("\\d+-\\d+");
        Matcher matcher = padrao.matcher(modalText);
        String conta = String.valueOf(matcher);
        String[] partes = conta.split("-");
        accountNumber = partes[0];
        accountDigit = partes[1];
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountDigit() {
        return accountDigit;
    }

    public void setSaldo() {
        this.saldo = registerPage.getBalanceStatusToggleField();
        //this.saldo.click();
        boolean currentState = saldo.isSelected();
        if (!currentState)
            saldo.click();
    }
}
