package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RegistrationPage {
    private final String NAME = "Evita";
    private final String SURNAME = "Alekna";
    private final String DISCOUNT = "QwEr137";
    private final int ADULTS = 1;
    private final int CHILDREN = 2;
    private final int BAGS = 3;
    private final String SELECTED_NEXT_FLIGHT = "11";

    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULT_COUNT = By.id("adults");
    private final By CHILDREN_COUNT = By.id("children");
    private final By LUGGAGE_COUNT = By.id("bugs");
    private final By NEXT_FLIGHT = By.id("flight");
    private final By BOOK_BTN = By.id("book2");

    private BaseFunc baseF;
    public RegistrationPage(BaseFunc param1) {
        this.baseF = param1;
    }

    @Test
    public void fillRegistrationPage() {

        this.baseF.fillField(NAME_INPUT, NAME);
        this.baseF.fillField(SURNAME_INPUT, SURNAME);
        this.baseF.fillField(DISCOUNT_INPUT, DISCOUNT);
        this.baseF.fillField(ADULT_COUNT, String.valueOf(ADULTS));
        this.baseF.fillField(CHILDREN_COUNT, String.valueOf(CHILDREN));
        this.baseF.fillField(LUGGAGE_COUNT, String.valueOf(BAGS));

        this.baseF.selectByValue(NEXT_FLIGHT, SELECTED_NEXT_FLIGHT);

        this.baseF.click(BOOK_BTN);
    }
}



