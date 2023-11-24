package sections.section4.workflow;

import org.openqa.selenium.WebDriver;
import sections.section4.locators.ForgotPasswordPage;
import sections.section4.methods.ReusableMethods;

public class ForgotPasswordPageFlow {
    private final WebDriver driver;
    ForgotPasswordPage passwordPage = new ForgotPasswordPage();
    ReusableMethods methods = new ReusableMethods();

    public ForgotPasswordPageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForgotPasswordForm(String name, String email, String phoneNumber) throws InterruptedException {
        driver.findElement(passwordPage.name).sendKeys(name);
        driver.findElement(passwordPage.email).sendKeys(email);
        driver.findElement(passwordPage.phoneNumber).sendKeys(phoneNumber);

    }

    public void clickResetButton() throws InterruptedException {
        methods.click(driver,passwordPage.resetButton);
    }

    public void clickGoToLogInButton() throws InterruptedException {
        methods.click(driver, passwordPage.goToLoginButton);
    }

    public String getPassword() {
        String infoMsg = driver.findElement(passwordPage.infoMessage).getText();
        String[] str = infoMsg.split("'");
        return str[1].trim();
    }
}
