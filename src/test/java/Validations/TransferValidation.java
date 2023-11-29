package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.TransferPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferValidation {

    private WebDriver driver;
    private TransferPage transferPage;
    private Waits waits;

    public  TransferValidation(WebDriver driver){
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void validationTransferPage() {
        try {
            waits.loadElement(transferPage.getTransferSubmitButton());
            WebElement transferSubmitButton = transferPage.getTransferSubmitButton();
            Assertions.assertNotNull(transferSubmitButton, "O botão de submissão não foi encontrado");
            Report.log(Status.PASS, "Acessou a página de Transferência com sucesso.", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
