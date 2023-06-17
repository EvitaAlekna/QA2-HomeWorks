package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {
    private WebDriver browser;
    private WebDriverWait wait;

    public BaseFunc() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();

        wait = new WebDriverWait(browser, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }

    public WebElement findElement(By locator) {
       return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        return browser.findElement(locator);
    }

    public void selectByValue(By locator, String text) {
        WebElement dropdown = browser.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }

    public void click(By locator) {
        browser.findElement(locator).click();
    }

    public void fillField(By locator, String text) {
        WebElement inputField = browser.findElement(locator);
        inputField.clear();
        inputField.sendKeys(text);
    }
}
