package sections.section4.locators;

import org.openqa.selenium.By;

public class ForgotPasswordPage {
    public By name = By.xpath("//input[@placeholder='Name']");
    public By email = By.xpath("//input[@placeholder='Email']");
    public By phoneNumber = By.xpath("//input[@placeholder='Phone Number']");
    public By resetButton = By.xpath("//div/button[2]");
    public By infoMessage = By.xpath("//p[@class='infoMsg']");
    public By goToLoginButton = By.xpath("//button[@class='go-to-login-btn']");

}
