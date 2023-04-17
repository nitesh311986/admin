package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountPageSteps {
    AccountPage accountPage = new AccountPage(DriverFactory.getDriver());


    @When("User clicks on account icon on left tool bar")
    public void user_clicks_on_account_icon_on_left_tool_bar() {
        accountPage.clickOnAccountIcon();
    }

    @When("User clicks on icon")
    public void user_clicks_on_icon() {
        accountPage.traversingThroughPages();
    }

    @Then("User will redirect to respected page")
    public void user_will_redirect_to_respected_page() {
        //String url=accountPage.displayURL();
        //System.out.println(url);
    }
}
