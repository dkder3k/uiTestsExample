import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

class DriverManager {

    private static String hubUrl = "http://localhost:4444/wd/hub"

    static WebDriver getRemoteWebDriver(String desiredBrowser) {
        DesiredCapabilities capability = new DesiredCapabilities(desiredBrowser, "", Platform.LINUX)
        return new RemoteWebDriver(new URL(hubUrl), capability)
    }

}
