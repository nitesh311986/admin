package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogOutPage;
import utils.ScreenRecorderUtil;

public class LogOutPageSteps {
    LogOutPage logOutPage=new LogOutPage();
    @When("User clicks on Logoff button")
    public void user_clicks_on_logoff_button() {
     logOutPage.clickOnLogOutButton();
    }

    @Then("User will redirect to login page")
    public void user_will_redirect_to_login_page() {
        String message=logOutPage.verifyLogInPage();
        Assert.assertEquals(message,"Login to your account");
        try {
            ScreenRecorderUtil.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
