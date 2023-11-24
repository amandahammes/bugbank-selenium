package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferPage {
    private WebDriver driver;
    private Waits wait;

    public TransferPage(WebDriver driver){
     this.driver = driver;
     wait = new Waits(this.driver);
    }
    public WebElement getNumberAccountTextField() {
        return wait.visibilityOfElement(By.xpath("//div[@class='card__register']//input[1]"));
    }
    public WebElement getDigitAccountTextField() {
        return wait.visibilityOfElement(By.xpath("//input[@name='digit']"));
    }
    public WebElement getTransferValueTextField(){
        return wait.visibilityOfElement(By.xpath("//input[@name='transferValue']"));
    }
    public WebElement getTransferDescriptionTextField(){
        return wait.visibilityOfElement(By.xpath("//input[@name='description']"));
    }
    public WebElement getTransferSubmitButton(){
        return wait.visibilityOfElement(By.className("CMabB"));
    }
    public WebElement getModalTextConfirmation(){
        return wait.visibilityOfElement(By.id("modalText"));
    }
    public WebElement getCloseModalButton(){
        return wait.visibilityOfElement(By.id("btnCloseModal"));
    }
}
