package Tasks;

import PageObjects.TransferPage;
import org.openqa.selenium.WebDriver;

public class TransferTask {
    private WebDriver driver;
    private TransferPage transferPage;

    public TransferTask(WebDriver driver) {
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
    }

}
