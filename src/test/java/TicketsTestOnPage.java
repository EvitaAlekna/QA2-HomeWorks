import Pages.BaseFunc;
import Pages.HomePage;
import Pages.RegistrationPage;
import Pages.SeatSelectionPage;
import org.junit.jupiter.api.Test;

public class TicketsTestOnPage {
    private final String URL = "http://www.qaguru.lv:8089/tickets";

    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.fillHomePage();

        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        registrationPage.fillRegistrationPage();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat();




    }
}
