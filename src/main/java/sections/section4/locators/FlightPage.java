package sections.section4.locators;

import org.openqa.selenium.By;

public class FlightPage {
    public By currencyDropdown = By.id("ctl00_mainContent_DropDownListCurrency");
    public By passengers = By.id("divpaxinfo");
    public By adultIncrement = By.id("hrefIncAdt");
    public By childIncrement = By.id("hrefIncChd");
    public By infantIncrement = By.id("hrefIncInf");
    public By adultDecrement = By.id("hrefDecAdt");
    public By childDecrement = By.id("hrefDecChd");
    public By infantDecrement = By.id("hrefDecInf");
    public By numOfAdult = By.id("spanAudlt");
    public By departure = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    public By done = By.id("btnclosepaxoption");
    public By from = By.xpath("//a[@value='DEL']");
    public By to = By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']");
    public By dateFlight = By.xpath("//td[@data-month='11'] //a[text()=\"25\"]");
    public By searchBar = By.id("autosuggest");
    public By searchResults = By.xpath("//a[@class='ui-corner-all']");
    public By familyAndFriendsCheckBox = By.xpath("//input[contains(@id,'friendsandfamily')]");
    public By seniorCitizenCheckBox = By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]");
    public By armedForcesCheckBox = By.xpath("//input[contains(@id,'IndArm')]");
    public By studentCheckBox = By.xpath("//input[contains(@id,'StudentDiscount')]");
    public By unaccompaniedMinorCheckBox = By.xpath("//input[contains(@id,'Unmr')]");
    public By studentLabel = By.xpath("//label[@for='ctl00_mainContent_chk_StudentDiscount']");
    public By familyAndFriendsLabel = By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']");
    public By seniorCitizenLabel = By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']");
    public By armedForcesLabel = By.xpath("//label[@for='ctl00_mainContent_chk_IndArm']");
    public By unaccompaniedMinorLabel = By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']");




}
