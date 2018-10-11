import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.*

class MainPage {

    private static final LOGO = $(By.xpath("//*[@id='hplogo']"))
    private static final SEARCH_FIELD = $(By.xpath("//*[@id='lst-ib']"))

    final static void open() {
        open("https://www.google.com/")
    }

    final static void searchFor(String searchText) {
        SEARCH_FIELD.setValue(searchText).pressEnter()
    }

}