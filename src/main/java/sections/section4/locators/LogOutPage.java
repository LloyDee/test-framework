package sections.section4.locators;

import org.openqa.selenium.By;

public class LogOutPage {
    public By logout = By.xpath("//button[@class='logout-btn']");
    public By successText = By.xpath("//p[contains(@style,'color')]");
    public By helloText = By.xpath("//div[@class='login-container']/h2");
}

