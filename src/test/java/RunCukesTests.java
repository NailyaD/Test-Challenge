import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

/**
 * RunCukesTest
 * Class for running tests.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "comtravo",
        strict = true,
        tags = "@flightsearchandbooking"
)

/*public class RunCukesTests {
}*/

public class RunCukesTests extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @Parameters("browser")
    @BeforeTest
    public void setupBrowser(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("selenide.browser", "Chrome");
        } else if (browser.equals("firefox")) {
            System.setProperty("selenide.browser", "Firefox");
        } else if (browser.equals("edge")) {
            System.setProperty("selenide.browser", "Edge");
        }
    }

}
