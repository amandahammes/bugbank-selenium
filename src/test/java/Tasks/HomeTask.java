package Tasks;


import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private WebDriver driver;
    private HomePage homePage;

    public HomeTask (WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

//    public void efetuarLogin(){
//        homePage.getUserNameTextField().sendKeys("standard_user");
//        homePage.getPasswordTextField().sendKeys("secret-user");
//        homePage.getLoginButton().click();
//    }
//
//    public void efetuarLoginParametrizado(String user, String password){
//        homePage.getUserNameTextField().sendKeys(user);
//        homePage.getPasswordTextField().sendKeys(password);
//        homePage.getLoginButton().click();
//    }

}
