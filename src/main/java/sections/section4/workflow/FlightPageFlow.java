package sections.section4.workflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sections.section4.locators.FlightPage;
import sections.section4.methods.ReusableMethods;

public class FlightPageFlow {

    ReusableMethods methods = new ReusableMethods();
    FlightPage flightPage = new FlightPage();

    private final WebDriver driver;

    public FlightPageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public Select getCurrency(int index) {
        return methods.selectByIndex(driver, flightPage.currencyDropdown, index);
    }

    public void clickPassengerDropDown() throws InterruptedException {
        methods.click(driver, flightPage.passengers);
    }

    public void clickDone() throws InterruptedException {
        methods.click(driver, flightPage.done);
    }

    public void addAdultPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {
            methods.click(driver, flightPage.adultIncrement);
        }
    }

    public void addChildPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {
            methods.click(driver, flightPage.childIncrement);
        }
    }

    public void addInfantPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {
            methods.click(driver, flightPage.infantIncrement);
        }
    }

    public void removeAdultPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {
            methods.click(driver, flightPage.adultDecrement);
        }
    }

    public void removeChildPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {

            methods.click(driver, flightPage.childDecrement);
        }
    }

    public void removeInfantPassenger(int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {

            methods.click(driver, flightPage.infantIncrement);
        }
    }

    public void checkNumberOfPassenger() throws InterruptedException {
        String currentPass = methods.getText(driver.findElement(flightPage.numOfAdult));
        int passenger = Integer.parseInt(currentPass);
        removeChildPassenger(passenger);
    }
}
