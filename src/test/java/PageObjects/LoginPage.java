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