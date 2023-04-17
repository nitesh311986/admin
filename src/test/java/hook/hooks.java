package hook;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.Constant;
import utils.ConfigReader;
import utils.FrameworkConfig;

import java.util.Properties;


public class hooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;
    public   Constant constant;


    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();

    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.init_browser(browserName);
        /*String urlName = prop.getProperty("url");
        if (urlName.equals("http://52.32.106.250:7779/"))
            DriverFactory.getDriver().get(urlName);
        else if (urlName.equals("http://52.32.106.250:8889/")) {
            DriverFactory.getDriver().get(urlName);
        } else {
            System.out.println("Please pass the correct url value: " + urlName);
        }*/
       // String constant.url
        DriverFactory.getDriver().get(constant.url);

    }

    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }

    @After(order = 1)
    public void takeScreenShotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", " _");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }


    }
    @After(order = 2)
    public void displayUrl(Scenario scenario) {
        String name=scenario.getName();
        scenario.log(constant.url);

    }
}
