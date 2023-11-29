package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakersGenerator;
import PageObjects.HomePage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomeValidation {
    private WebDriver driver;
    private HomePage homePage;
    private Waits waits;

    public  HomeValidation(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
        waits = new Waits(this.driver);
    }

    public void validationHomePage() {
        try {
            waits.loadElement(homePage.getWelcomeText());
            String welcomeText = homePage.getWelcomeText().getText();
            Assertions.assertEquals("bem vindo ao BugBank :)", welcomeText);
            Report.log(Status.PASS, "Acessou a página home com sucesso", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationBalanceValueAccount2() {
        try {
            waits.loadElement(homePage.getSaldoTextField());
            String balanceText = homePage.getSaldoTextField().getText();
            Assertions.assertEquals("Saldo em conta R$ 900,00", balanceText);
            Report.log(Status.PASS, "Apresentou valor de saldo correto.", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationBalanceValueAccount1() {
        try {
            waits.loadElement(homePage.getSaldoTextField());
            String balanceText = homePage.getSaldoTextField().getText();
            Assertions.assertEquals("Saldo em conta R$ 1.100,00", balanceText);
            Report.log(Status.PASS, "Apresentou valor de saldo correto.", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
