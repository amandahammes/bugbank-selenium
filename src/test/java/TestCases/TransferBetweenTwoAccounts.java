package TestCases;

import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Framework.Utils.FakersGenerator;
import Tasks.*;
import Validations.HomeValidation;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TransferBetweenTwoAccounts extends TestBase {
    private WebDriver driver = this.getDriver();
    private RegisterTask registerTask = new RegisterTask(driver);
    private LoginTask loginTask = new LoginTask(driver);
    private HomeTask homeTask = new HomeTask(driver);
    private TransferTask transferTask = new TransferTask(driver);
    private HomeValidation homeValidation = new HomeValidation(driver);
    FakersGenerator testDataGenerator = new FakersGenerator();

    private String name1= testDataGenerator.generateName();
    private String email1 = testDataGenerator.generateEmail();
    private String password1 = testDataGenerator.generatePassword();
    private String name2 = testDataGenerator.generateName();
    private String email2 = testDataGenerator.generateEmail();
    private String password2 = testDataGenerator.generatePassword();
    private int transferValue = testDataGenerator.generateTransferValue();


    @Test
    public void realizarTransferenciaEntreDuasContas(){
        try{
            Report.createTest("Realizar transferência entre duas contas com sucesso", ReportType.SINGLE);
            loginTask.irPaginaCadastro();
            registerTask.cadastrarUsuario(email1,name1,password1);
            loginTask.efetuarLogin(email1,password1);
            homeTask.conferirNumeroConta();
            homeTask.sairHome();
            loginTask.irPaginaCadastro();
            registerTask.cadastrarUsuario(email2,name2,password2);
            loginTask.efetuarLogin(email2,password2);
            homeTask.irPaginaTransferencia();
            transferTask.realizarTransferencia(homeTask.getAccountNumber(), homeTask.getAccountDigit());
            transferTask.voltarHome();
            homeValidation.validationBalanceValueAccount2();
            homeTask.sairHome();
            loginTask.efetuarLogin(email1,password1);
            homeValidation.validationBalanceValueAccount1();
            homeTask.sairHome();

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
   }
}
