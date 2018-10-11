import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.SelenideElement

import static com.codeborne.selenide.Selenide.*

class SearchResultsPage {

    static final ElementsCollection getResults() {
        return $$("#ires .g")
    }

    static final SelenideElement getResult(int index) {
        return $("#ires .g", index)
    }

}
