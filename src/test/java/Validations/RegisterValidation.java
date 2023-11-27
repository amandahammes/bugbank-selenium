package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.RegisterPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class RegisterValidation {
    private WebDriver driver;
    private RegisterPage registerPage;
    private Waits waits;

    public  RegisterValidation(WebDriver driver){
        this.driver = driver;
        registerPage = new RegisterPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void validationRegisterPage(){
        try{
            waits.loadElement(registerPage.getUserNameTextField());
            Assertions.assertTrue(registerPage.getBalanceStatusToggle().isDisplayed());
            Report.log(Status.PASS, "Acessou a página de registro com sucesso", Screenshot.capture(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
