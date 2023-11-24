package sections.section4.workflow;

import org.openqa.selenium.WebDriver;
import sections.section4.locators.LogOutPage;
import sections.section4.methods.ReusableMethods;

public class LogOutFlow {
    private final WebDriver driver;

    ReusableMethods methods = new ReusableMethods();
    LogOutPage logoutPage = new LogOutPage();

    public LogOutFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() throws InterruptedException {
        System.out.println("test");
        methods.click(driver, logoutPage.logout);
    }

    public String getSuccessText() {
        return driver.findElement(logoutPage.successText).getText();
    }

    public String getHelloText() {
        return driver.findElement(logoutPage.helloText).getText();
    }
}
