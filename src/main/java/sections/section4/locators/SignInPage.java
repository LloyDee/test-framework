package sections.section4.locators;

import org.openqa.selenium.By;

public class SignInPage {
  public By username = By.id("inputUsername");
  public By password = By.name("inputPassword");
  public By signInButton1 = By.cssSelector("button.signInBtn");
  public By signInButton = By.xpath("//button[contains(@class,'signInBtn')]");
  public By errorMsg = By.cssSelector("p.error");
  public By forgotPassLink = By.xpath("//div/a");
  public By rememberBox = By.xpath("//input[@id='chkboxOne']");


}
