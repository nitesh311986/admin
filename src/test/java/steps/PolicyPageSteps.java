package steps;

import factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.PolicyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PolicyPageSteps {
    PolicyPage policyPage = new PolicyPage(DriverFactory.getDriver());


    @When("User clicks on policy icon on left tool bar")
    public void user_clicks_on_policy_icon_on_left_tool_bar() {
        policyPage.clickPolicyIcon();
    }

    @Then("User can see {string} message with all policy data")
    public void user_can_see_message_with_all_policy_data(String string) {
        String mpMessage = policyPage.verifyManagePolicyPage();
        Assert.assertEquals(mpMessage, string);
        String dataArray = policyPage.fetchAndDisplayData();
        System.out.println(dataArray);
    }

    @Then("All data under Start date and And date displays in dd-mm-yyyy format")
    public void all_data_under_start_date_and_and_date_displays_in_dd_mm_yyyy_format() {
        String startDate = policyPage.verifyDateFormatOfStartDate();
        String sDate[] = startDate.split(" ");
        for (String staDate : sDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = staDate.matches(datePattern);
            if (!isDate) {
                System.out.println("StartDate Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

        String expireDate = policyPage.verfiyDateFormatOfExpireDate();
        String endDate[] = expireDate.split(" ");
        for (String eDate : endDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = eDate.matches(datePattern);
            if (!isDate) {
                System.out.println("ExpireDate Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

    }

    @When("User clicks on policy number")
    public void user_clicks_on_policy_number() {
        policyPage.clickOnPolicyNumberLink();

    }

    @Then("User will redirect to policy information page")
    public void user_will_redirect_to_policy_information_page() {
        String displayMessage = policyPage.verifyPolicyInformationPage();
        Assert.assertEquals(displayMessage, "Policy Information");

    }

    @When("User clicks on policy number link")
    public void user_clicks_on_policy_number_link() {
        policyPage.clickOnPolicyNumberLink();
    }

    @When("User clicks on letter tab on policy information page")
    public void user_clicks_on_letter_tab_on_policy_information_page() {
        policyPage.LetterIcon();
    }

    @When("User clicks on download icon")
    public void user_clicks_on_download_icon() {
        policyPage.DownloadIcon();

    }

    @Then("User will able to see downloaded policy page")
    public void user_will_able_to_see_downloaded_policy_page() {
        String downloadFile=policyPage.verifyDownLoadFile();
        if (downloadFile.equals("file exist")) {
            System.out.println("File Has Been Downloaded");
        } else {
            Assert.fail();
        }

    }

}
