import spock.lang.Shared
import spock.lang.Unroll
import spock.lang.Specification
import com.codeborne.selenide.*

import static com.codeborne.selenide.CollectionCondition.*
import static com.codeborne.selenide.Condition.*

class ExampleTest extends Specification {

    @Shared
    def browsers = ["chrome", "firefox"]

    def cleanup() {
        WebDriverRunner.closeWebDriver()
    }

    @Unroll
    def "Open main page in #browser"(def browser) {
        setup:
        def driver = DriverManager.getRemoteWebDriver(browser)
        WebDriverRunner.setWebDriver(driver)

        when:
        MainPage.open()

        then:
        MainPage.LOGO.shouldBe(visible)
        MainPage.SEARCH_FIELD.shouldBe(visible)

        where:
        browser << browsers
    }

    @Unroll
    def "Search in #browser"(def browser) {
        setup:
        def driver = DriverManager.getRemoteWebDriver(browser)
        WebDriverRunner.setWebDriver(driver)

        when:
        MainPage.open()
        MainPage.searchFor("github")

        then:
        SearchResultsPage.getResults().shouldHave(sizeGreaterThan(1))
        SearchResultsPage.getResult(0).shouldHave(text("The world's leading software development platform"))

        where:
        browser << browsers
    }

}