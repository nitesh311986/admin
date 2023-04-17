package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LogInPage;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @When("User verify url {string}")
    public void user_verify_url(String string) {
        String url = homePage.verifyUrl();
        System.out.println("Current Page Url" + url);
        Assert.assertEquals(url, "http://52.32.106.250:7779/");
    }

    @Then("User will able to see text {string} behind copyright message")
    public void user_will_able_to_see_text_behind_copyright_message(String string) {
        String Msg = homePage.verifyMessage();
        if (Msg.contains(string)) {
            System.out.println("Home page displayed with required text ");
        } else {
            Assert.fail();
        }

    }
}
