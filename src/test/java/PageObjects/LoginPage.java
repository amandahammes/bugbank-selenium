package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private WebDriver driver;
    private Waits wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getUserNameTextField() {
       return wait.visibilityOfElement(By.xpath("//input[@name='email']"));
    }

    public WebElement getPasswordTextField() {
        return wait.visibilityOfElement(By.xpath("//input[@name='password']"));
    }

    public WebElement getLoginButton() {
        return wait.visibilityOfElement(By.cssSelector(".otUnI"));
    }

    public WebElement getRegisterButton() {
        return wait.visibilityOfElement(By.xpath("//*[text()='Registrar']"));
    }
}

//                WebElement botaoRegistrar = driver.findElement(By.xpath("//*[text()='Registrar']"));
//                botaoRegistrar.click();
//                WebElement campoEmail = driver.findElement(By.xpath("//div[@class='card__register']//input[1]"));
//                campoEmail.sendKeys("amandamail@mail.com");
//                WebElement campoNome = driver.findElement(By.xpath("//input[@placeholder='Informe seu Nome']"));
//                campoNome.sendKeys("Amanda");
//                WebElement campoSenha = driver.findElement(By.cssSelector(".login__password:nth-child(4) .input__default"));
//                campoSenha.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//                WebElement campoValidarSenha = driver.findElement(By.cssSelector(".login__password:nth-child(5) .input__default"));
//                campoValidarSenha.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//                WebElement saldo = driver.findElement(By.id("toggleAddBalance"));
//                boolean currentState = saldo.isSelected();
//                if (!currentState)
//                saldo.click();
//                WebElement submit = driver.findElement(By.cssSelector(".CMabB"));
//                submit.click();
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//                WebElement modalTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modalText")));
//                String textoDoModal = modalTextElement.getText();
//                //Assertions
//                Assertions.assertTrue(textoDoModal.contains("foi criada com sucesso"));
//                WebElement btnModal = driver.findElement(By.id("btnCloseModal"));
//                btnModal.click();
//                Thread.sleep(4000);
//                WebElement inputNomeLogin = driver.findElement(By.xpath("//input[@name='email']"));
//                inputNomeLogin.sendKeys("amandamail@mail.com");
//                WebElement inputSenhaLogin = driver.findElement(By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__password > div > input"));
//                inputSenhaLogin.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//                WebElement botaoAcessar = driver.findElement(By.cssSelector(".otUnI"));
//                botaoAcessar.click();