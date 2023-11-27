package TestCases;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Framework.Utils.DataGenerator;
import Tasks.HomeTask;
import Tasks.LoginTask;
import Tasks.RegisterTask;
import Tasks.TransferTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TransferBetweenTwoAccounts extends TestBase {
    private WebDriver driver = this.getDriver();
    private RegisterTask registerTask = new RegisterTask(driver);
    private LoginTask loginTask = new LoginTask(driver);
    private HomeTask homeTask = new HomeTask(driver);
    private TransferTask transferTask = new TransferTask(driver);
    DataGenerator testDataGenerator = new DataGenerator();

    private String name1= testDataGenerator.generateName();
    private String email1 = testDataGenerator.generateEmail();
    private String password1 = testDataGenerator.generatePassword();
    private String name2 = testDataGenerator.generateName();
    private String email2 = testDataGenerator.generateEmail();
    private String password2 = testDataGenerator.generatePassword();

   @Test
    public void realizarTransferenciaEntreDuasContas(){
        try{
            loginTask.irPaginaCadastro();
            registerTask.cadastrarUsuario(email1,name1,password1);
            String numeroConta1 = registerTask.getAccountNumber();
            String digitoConta1 = registerTask.getAccountDigit();
            loginTask.irPaginaCadastro();
            registerTask.cadastrarUsuario(name2,email2,password2);
            loginTask.efetuarLogin(email2,password2);
            homeTask.irPaginaTransferencia();
            transferTask.realizarTransferencia(numeroConta1, digitoConta1);
            transferTask.voltarHome();
            homeTask.sairHome();

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
   }
}
