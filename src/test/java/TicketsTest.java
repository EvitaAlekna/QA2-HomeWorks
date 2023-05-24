import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.model.Value;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TicketsTest {
    //Testavije dannije kak i lokatori zhelateljno skladivatj sdesj
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick = 'setLang();']");
    private final By NEXT_FLIGHT = By.id("flight");
    private final By BOOK_BTN = By.id("book2");
    private final By SELECTED_SEAT = By.xpath(".//div[@onclick = 'seat(13)']");
    private final By BOOK_BTN3 = By.id("book3");


    private final By SELECTED_AIRPORT =By.xpath(".//span[@class = 'bTxt']");
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULT_COUNT = By.id("adults");
    private final By CHILDREN_COUNT = By.id("children");
    private final By LUGGAGE_COUNT = By.id("bugs");
    private final By TEXT = By.xpath(".//div[@class = 'finalTxt']");

    private final String URL = "http://www.qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";
    private final String SELECTED_NEXT_FLIGHT = "11";

    private final String NAME = "Evita";
    private final String SURNAME = "Alekna";
    private final String DISCOUNT = "QwEr137";
    private final int ADULTS = 1;
    private final int CHILDREN = 2;
    private final int BUGS = 3;

    @Test
    public void successTicketsBookCheck() {
        // Open browser
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        // Open Home Page
        browser.get(URL);

        // Select Departure airport
        WebElement fromDropdown = browser.findElement(FROM);
        Select fromSelect = new Select(fromDropdown);
        fromSelect.selectByValue(DEPARTURE_AIRPORT);

        // Select Arrival airport
        WebElement toDropdown = browser.findElement(TO);
        Select toSelect = new Select(toDropdown);
        toSelect.selectByValue(ARRIVAL_AIRPORT);

        // Press GoGoGo btn
        browser.findElement(GO_BTN).click();

        //Check if selected airport appears
        List<WebElement> selectedAirports = browser.findElements(SELECTED_AIRPORT);
        System.out.println("First airport" + " " + selectedAirports.get(0).getText());
        System.out.println("Second airport" + " " + selectedAirports.get(1).getText());

        // Fill in passengers personal info
        WebElement nameInputField = browser.findElement(NAME_INPUT);
        nameInputField.clear();
        nameInputField.sendKeys(NAME);

        WebElement surnameInputField = browser.findElement(SURNAME_INPUT);
        surnameInputField.clear();
        surnameInputField.sendKeys(SURNAME);

        WebElement discountInputField = browser.findElement(DISCOUNT_INPUT);
        discountInputField.clear();
        discountInputField.sendKeys(DISCOUNT);

        WebElement adultInputField = browser.findElement(ADULT_COUNT);
        adultInputField.clear();
        adultInputField.sendKeys(String.valueOf(ADULTS));

        WebElement childrenInputField = browser.findElement(CHILDREN_COUNT);
        childrenInputField.clear();
        childrenInputField.sendKeys(String.valueOf(CHILDREN));

        WebElement luggageInputField = browser.findElement(LUGGAGE_COUNT);
        luggageInputField.clear();
        luggageInputField.sendKeys(String.valueOf(BUGS));

        // Select next flight
        WebElement nextFlightsDropdown = browser.findElement(NEXT_FLIGHT);
        Select nextFlightSelect = new Select(nextFlightsDropdown);
        nextFlightSelect.selectByValue(SELECTED_NEXT_FLIGHT);

        // Press Get Price link
        browser.findElement(GET_PRICE_BTN).click();

        // Press Book btn
        browser.findElement(BOOK_BTN).click();

        // Select seat Nr
        browser.findElement(SELECTED_SEAT).click();

        // Press book btn
        browser.findElement(BOOK_BTN3).click();

        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Check if successful msg appears
        WebElement finalText = browser.findElement(TEXT);
        System.out.println(finalText.getText());

        //test change

    }
}

