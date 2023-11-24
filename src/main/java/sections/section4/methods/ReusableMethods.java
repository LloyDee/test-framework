package sections.section4.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ReusableMethods implements Functions {
    @Override

    public void click(WebElement element) throws InterruptedException {
        Thread.sleep(1000);
        element.click();
    }

    @Override
    public void click(WebDriver driver, By by) throws InterruptedException {
        WebElement element = driver.findElement(by);
        highlightElement(driver, element);
        Thread.sleep(1000);
        element.click();
    }

    @Override
    public Select selectByIndex(WebDriver driver, By by, int index) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByIndex(index);
        return dropDown;
    }

    @Override
    public Select selectByVisibility(WebDriver driver, By by, String text) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByVisibleText(text);
        return dropDown;
    }

    @Override
    public Select selectByValue(WebDriver driver, By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
        return dropDown;
    }

    @Override
    public String sendKeys(WebDriver driver, By by, String value) {
        WebElement element = driver.findElement(by);
        element.sendKeys(value);
        return value;
    }

    @Override
    public String getText(Select select) {
        return select.getFirstSelectedOption().getText();
    }

    @Override
    public String getText(WebElement element) {
        return element.getText();
    }

    @Override
    public List<WebElement> getWebElements(WebDriver driver, By by) {
        List<WebElement> elements = driver.findElements(by);
        for (WebElement element :
                elements) {
            System.out.println(element.getText());

        }
        return elements;
    }

    @Override
    public void highlightElement(WebDriver driver, WebElement elem) throws InterruptedException {
        int count = 2;
        for (int i = 0; i < count; i++) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');", elem);
            Thread.sleep(200);
            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid white;');", elem);
        }

    }

    @Override
    public boolean isSelected(WebElement webElement) throws InterruptedException {
        return webElement.isSelected();
    }

}
