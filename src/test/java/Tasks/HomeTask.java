package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private WebDriver driver;
    private HomePage homePage;
    private String accountNumber;
    private String accountDigit;
    private String balanceAccount;

    public HomeTask (WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

    public void conferirNumeroConta() {
        String numberAccount = homePage.getBankAccountNumberField().getText();
        String numeroConta = numberAccount.replaceAll("Conta digital: ", "").trim();
        String[] partes = numeroConta.split("-");
        setAccountNumber(partes[0]);
        setAccountDigit(partes[1]);
    }
    public void conferirSaldoEmConta(){
        String saldoText = homePage.getSaldoTextField().getText();
        balanceAccount = saldoText.replaceAll("Saldo em conta R$ ", "").trim();

    }
    public void irPaginaTransferencia(){
        homePage.getTransferButton().click();
    }
    public void irPaginaExtrato(){
        homePage.getExtractButton().click();
    }
    public void sairHome(){
        homePage.getSignOutButton().click();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountDigit() {
        return accountDigit;
    }

    public String getBalanceAccount() {
        return balanceAccount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountDigit(String accountDigit) {
        this.accountDigit = accountDigit;
    }

    public void setBalanceAccount(String balanceAccount) {
        this.balanceAccount = balanceAccount;
    }
}
