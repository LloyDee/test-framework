package sections.section4.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public interface Functions {
    public void click(WebElement element) throws InterruptedException;


    public void click(WebDriver driver, By by) throws InterruptedException;


    public Select selectByIndex(WebDriver driver, By by, int index);


    public Select selectByVisibility(WebDriver driver, By by, String text);


    public Select selectByValue(WebDriver driver, By by, String value);


    public String sendKeys(WebDriver driver, By by, String value);


    public String getText(Select select);


    public String getText(WebElement element);


    public List<WebElement> getWebElements(WebDriver driver, By by);

    public void highlightElement(WebDriver driver, WebElement elem) throws InterruptedException;

    public boolean isSelected( WebElement webElement)throws InterruptedException;
}
