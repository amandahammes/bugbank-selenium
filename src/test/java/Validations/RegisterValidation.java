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
            waits.loadElement(registerPage.getConfirmationPasswordText());
            Assertions.assertTrue(registerPage.getConfirmationPasswordText().isDisplayed());
            Report.log(Status.PASS, "Acessou a página de cadastro com sucesso", Screenshot.capture(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationRegisterNewAccount(){
        try {
            waits.loadElement(registerPage.getModalText());
            String modalText = registerPage.getModalText().getText();
            Assertions.assertTrue(modalText.contains("foi criada com sucesso"));
            Report.log(Status.PASS, "Realizou cadastro de conta com sucesso", Screenshot.capture(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
