package Tasks;

import PageObjects.HomePage;
import Validations.HomeValidation;
import Validations.LoginValidation;
import Validations.TransferValidation;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private WebDriver driver;
    private HomePage homePage;
    private TransferValidation transferValidation;
    private LoginValidation loginValidation;
    private String accountNumber;
    private String accountDigit;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
        transferValidation = new TransferValidation(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }

    public void conferirNumeroConta() {
        String numberAccount = homePage.getBankAccountNumberField().getText();
        String numeroConta = numberAccount.replaceAll("Conta digital: ", "").trim();
        String[] partes = numeroConta.split("-");
        setAccountNumber(partes[0]);
        setAccountDigit(partes[1]);
    }

    public void irPaginaTransferencia() {
        homePage.getTransferButton().click();
        transferValidation.validationTransferPage();
    }

    public void irPaginaExtrato() {
        homePage.getExtractButton().click();
    }

    public void sairHome() {
        homePage.getSignOutButton().click();
        loginValidation.validationLoginPage();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountDigit() {
        return accountDigit;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountDigit(String accountDigit) {
        this.accountDigit = accountDigit;
    }
}
