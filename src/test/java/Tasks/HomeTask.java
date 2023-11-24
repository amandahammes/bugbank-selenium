package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private WebDriver driver;
    private HomePage homePage;
    private String accountNumber;
    private String accountDigit;

    public HomeTask (WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

    public void conferirNumeroConta() {
        String numberAccount = homePage.getBankAccountNumberField().getText();
        String numeroConta = numberAccount.replaceAll("Conta digital: ", "").trim();
        String[] partes = numeroConta.split("-");
        accountNumber = partes[0];
        accountDigit = partes[1];
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
}
