package Tasks;

import PageObjects.TransferPage;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransferTask {
    private WebDriver driver;
    private TransferPage transferPage;
    private HomeTask homeTask;
    private String modalText;

    public TransferTask(WebDriver driver) {
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
        homeTask = new HomeTask(driver);
    }

    public void realizarTransferencia(String accountNumber, String accountDigit){
        transferPage.getNumberAccountTextField().sendKeys(accountNumber);
        transferPage.getDigitAccountTextField().sendKeys(accountDigit);
        transferPage.getTransferValueTextField().sendKeys("100");
        transferPage.getTransferDescriptionTextField().sendKeys("Compra livros");
        transferPage.getTransferSubmitButton().click();
        modalText = transferPage.getModalTextConfirmation().getText();

        transferPage.getCloseModalButton().click();
    }

    public void voltarHome(){
        transferPage.getBackButton().click();
    }

}
