package Validations;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.LoginPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginValidation {
    private WebDriver driver;
    private LoginPage loginPage;
    private Waits waits;

    public  LoginValidation(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        waits = new Waits(this.driver);
    }

    public  void validationLoginPage(){
        try{
            waits.loadElement(loginPage.getUserNameTextField());
            Assertions.assertTrue(loginPage.getUserNameTextField().isDisplayed());
            Report.log(Status.PASS, "Acessou a página de login com sucesso", Screenshot.capture(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}