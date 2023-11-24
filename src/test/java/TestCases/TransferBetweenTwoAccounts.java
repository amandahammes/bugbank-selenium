package TestCases;

import Framework.TestBase;
import Tasks.RegisterTask;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class TransferBetweenTwoAccounts extends TestBase {
    private WebDriver driver = this.getDriver();
    private RegisterTask registerTask = new RegisterTask(driver);

    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/register.csv", numLinesToSkip = 1)
    public void registerUser(String email, String name, String password, String passwordConfirmation){
        registerTask.cadastrarUsuario(email, name, password, passwordConfirmation);
    }
}
