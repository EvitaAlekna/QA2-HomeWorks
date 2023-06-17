package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SeatSelectionPage {
    private final By SELECTED_SEAT = By.xpath(".//div[@onclick = 'seat(13)']");
    private final By BOOK_BTN3 = By.id("book3");

    private BaseFunc base;

    public SeatSelectionPage(BaseFunc param) {
        this.base = param;
    }

    @Test
    public void selectSeat() {
        this.base.click(SELECTED_SEAT);
        this.base.click(BOOK_BTN3);
    }
}
