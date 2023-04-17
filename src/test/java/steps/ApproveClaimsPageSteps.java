package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.ApproveClaimPage;

public class ApproveClaimsPageSteps {
    ApproveClaimPage approveClaimPage = new ApproveClaimPage(DriverFactory.getDriver());

    @When("User clicks on approve claims icon on left tool bar")
    public void user_clicks_on_approve_claims_icon_on_left_tool_bar() {
        approveClaimPage.clickOnApproveClaimButton();

    }

    @Then("User will redirect to page with {string} message on it")
    public void user_will_redirect_to_page_with_message_on_it(String string) {
        String Message = approveClaimPage.verifyApproveClaimPage();
        Assert.assertEquals(Message, string);
    }

    @Then("User will able to see data on approve claims page")
    public void user_will_able_to_see_data_on_approve_claims_page() {
        String data = approveClaimPage.fetchData();
       if(data.isBlank())
       {
           Assert.fail();
       }
    }


}
