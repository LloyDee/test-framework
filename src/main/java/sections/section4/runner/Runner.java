package sections.section4.runner;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.*;
import org.testng.Assert;
import sections.section4.locators.FlightPage;
import sections.section4.methods.ReusableMethods;
import sections.section4.workflow.FlightPageFlow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--headless");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\loyd_\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new FirefoxDriver();

//        SigInPageFlow signingFlow = new SigInPageFlow(driver);
//        ForgotPasswordPageFlow forgotPasswordFlow = new ForgotPasswordPageFlow(driver);
//        LogOutFlow logoutFlow = new LogOutFlow(driver);

        FlightPageFlow flightPage = new FlightPageFlow(driver);
        FlightPage flight = new FlightPage();
        ReusableMethods methods = new ReusableMethods();

        String username = "Lloyd";
        String email = "loyd@yahoo.com";
        String phoneNumber = "1234568963";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

        /***end-2-end***/
        /****
         * Select From Delhi
         * Select To Chennai
         * Select Depart Date Dec 25
         * Check Family and friends
         * Passengers
         *  2 adults, 3 children and 1 infant
         * Currency USD
         */


        flightPage.bookAFlight(1,3,1, "USD");
        methods.selectByValue(driver, flight.currencyDropdown, "USD");

        /** Assertions with Checkboxes**/

//        methods.click(driver, flight.armedForcesCheckBox);
//        WebElement partOfPage = driver.findElement(By.id("discount-checkbox"));
//
//        List<WebElement> checkboxes = partOfPage.findElements(By.xpath("//input[@type='checkbox']"));
//        Assert.assertEquals(checkboxes.size(),6);
//
//        Map<WebElement, WebElement> checkBoxes = new HashMap<>(Map.of(
//                driver.findElement(flight.familyAndFriendsLabel),driver.findElement(flight.familyAndFriendsCheckBox),
//                driver.findElement(flight.seniorCitizenLabel),driver.findElement(flight.seniorCitizenCheckBox),
//                driver.findElement(flight.armedForcesLabel),driver.findElement(flight.armedForcesCheckBox),
//                driver.findElement(flight.studentLabel),driver.findElement(flight.studentCheckBox),
//                driver.findElement(flight.unaccompaniedMinorLabel),driver.findElement(flight.unaccompaniedMinorCheckBox)
//        ));
//        checkBoxes.forEach((key, value)-> {
//            try {
//                Assert.assertFalse(methods.isSelected(value));
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//       checkBoxes.forEach((key, value) -> {
//           try {
//               System.out.println(methods.getText(key) + " is checked? \t"+ methods.isSelected(value));
//           } catch (InterruptedException e) {
//               throw new RuntimeException(e);
//           }
//       });


        /** Handling AutoSuggestive dropdowm **/

//        methods.sendKeys(driver, flight.searchBar, "Ma");
//        List<WebElement> elements = methods.getWebElements(driver, flight.searchResults);
//
//        for (WebElement element :
//                elements) {
//            if (element.getText().contains("Jamaica")){
//                methods.click(element);
//                break;
//            }
//        }
//        System.out.println(methods.getText(driver.findElement(flight.searchResults)));

//        /*** Dynamic WebElements Automation ***/
//        methods.click(driver, flight.departure);
//        methods.click(driver, flight.from);
//        System.out.println("FROM: " + methods.getText(driver.findElement(flight.from)));
//        methods.click(driver, flight.to);
//        System.out.println("TO: " + methods.getText(driver.findElement(flight.to)));
//
//
//        /***Flight Automation***/
//
//        System.out.println(methods.getText(flightPage.getCurrency(3)));
//        Assert.assertEquals(methods.getText(flightPage.getCurrency(2)),"AED");
//
//        flightPage.clickPassengerDropDown();
//        flightPage.addAdultPassenger(1);
//        flightPage.addChildPassenger(2);
//        flightPage.addInfantPassenger(2);
//
//        flightPage.clickDone();
//        System.out.println(methods.getText(driver.findElement(flight.passengers)));


//        driver.navigate().to("https://www.google.com");
//        driver.navigate().back();


        /***Sign In Automation***/

//        signingFlow.signIn(username,"password");
//        signingFlow.clickSignInButton();
//        signingFlow.clickRememberUsername();
//        signingFlow.clickForgotPasswordLink();
//
//        forgotPasswordFlow.fillForgotPasswordForm(username,email,phoneNumber);
//        forgotPasswordFlow.clickResetButton();
//        String temporaryPassword = forgotPasswordFlow.getPassword();
//        forgotPasswordFlow.clickGoToLogInButton();
//
//        signingFlow.signIn(username,temporaryPassword);
//        signingFlow.clickSignInButton();
//
//        logoutFlow.logout();

        Thread.sleep(3000);
        driver.close();
    }


}
