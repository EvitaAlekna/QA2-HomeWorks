package Pages;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
      this.baseFunc = baseFunc;
    }

    @Test
    public void fillHomePage() {

        this.baseFunc.selectByValue(FROM, DEPARTURE_AIRPORT);
        this.baseFunc.selectByValue(TO, ARRIVAL_AIRPORT);

        this.baseFunc.click(GO_BTN);


    }



}
