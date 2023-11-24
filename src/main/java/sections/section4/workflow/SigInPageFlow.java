package sections.section4.workflow;

import org.openqa.selenium.WebDriver;
import sections.section4.locators.SignInPage;
import sections.section4.methods.ReusableMethods;

public class SigInPageFlow {

    ReusableMethods methods = new ReusableMethods();
    SignInPage signInPage = new SignInPage();
    private final WebDriver driver;

    public SigInPageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void signIn(String username, String password) throws InterruptedException {

        driver.findElement(signInPage.username).sendKeys(username);
        driver.findElement(signInPage.password).sendKeys(password);

    }

    public void clickSignInButton() throws InterruptedException {
        methods.click(driver, signInPage.signInButton);
    }

    public void clickForgotPasswordLink() throws InterruptedException {

        methods.click(driver, signInPage.forgotPassLink);
    }

    public void clickRememberUsername() throws InterruptedException {
        boolean isChecked = driver.findElement(signInPage.rememberBox).isSelected();
        if (!isChecked){
            methods.click(driver, signInPage.rememberBox);
        }
    }

    public String getErrorMessageFromSignIn() {
        return driver.findElement(signInPage.errorMsg).getText();
    }

}
