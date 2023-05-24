import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTests {
    //sjuda skladivajutsa lokatori
    //private final - konstanta - VSEGDA KAPSOM PISHETSA
    private final By REGISTRATION_FORM = By.id("registration-form");
    private final By FIRS_NAME_INPUT_FIELD = By.name("first-name");
    private final By SMART_NET_JOIN_BUTTON = By.xpath(".//span[@class = 'smart-net-banner__info-button-text']");
    private final By LOGO = By.tagName("img");
    private final By SEARCH_INPUT = By.id("q");


    @Test
    public void firstSeleniumTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://1a.lv");

        browser.findElement(SEARCH_INPUT).sendKeys("Hello, World!");

       // WebElement registrationForm = browser.findElement(LOGO); //search inside page
       // registrationForm.findElement(LOGO); //search inside element

    }
}