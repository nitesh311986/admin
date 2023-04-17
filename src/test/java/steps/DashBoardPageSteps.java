package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DashBoardPage;
import utils.ScreenRecorderUtil;

public class DashBoardPageSteps {
    DashBoardPage dbp = new DashBoardPage();

    @Given("User must be logged with username {string} and password {string} in to the admin panel")
    public void user_must_be_logged_with_username_and_password_in_to_the_admin_panel(String string, String string2) {

       // MainPage mn = new MainPage();
       // mn.enterUserName(string);
        //mn.enterPassword(string2);
        //mn.clickSubmit();

    }

    @Then("User is able to see tag {string} and number of total client {string} and monthly client {string}")
    public void user_is_able_to_see_tag_and_number_of_total_client_and_monthly_client(String string, String string2, String string3) {
        String itemsDetails = dbp.verifyClientDetails();
        System.out.println(itemsDetails);
        String itemDetail[] = itemsDetails.split("\s");
        int aLength = itemDetail.length;
        for (int i = 0; i < aLength; i++) {
            if (itemDetail[i].equals(string)) {
                System.out.println("Client Tag Is Presented");
            } else if (itemDetail[i].equals(string2)) {
                System.out.println("Total Client Number Has Updated");
            } else if (itemDetail[i].equals(string3)) {
                System.out.println("Monthly Client Number Has Updated");

            } else {
                Assert.fail();
            }
        }
        try {
            ScreenRecorderUtil.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User is able to see tag {string} and number of total quote {string} and monthly quote {string}")
    public void user_is_able_to_see_tag_and_number_of_total_quote_and_monthly_quote(String string, String string2, String string3) {
        String quoteDetails = dbp.verifyQuote();
        System.out.println(quoteDetails);
        String quoteDetail[] = quoteDetails.split("\s");
        int qLength = quoteDetail.length;
        for (int i = 0; i < qLength; i++) {
            if (quoteDetail[i].equals(string)) {
                System.out.println("Quote Tag Is Presented");
            } else if (quoteDetail[i].equals(string2)) {
                System.out.println("Total Quote Number Has Updated");
            } else if (quoteDetail[i].equals(string3)) {
                System.out.println("Monthly Quote Number Has Updated");

            } else {
                Assert.fail();
            }
        }
    }

    @Then("User is able to see tag {string} and number of total policy {string} and monthly policy {string}")
    public void user_is_able_to_see_tag_and_number_of_total_policy_and_monthly_policy(String string, String string2, String string3) {
        String policyDetails = dbp.verifyPolicy();
        System.out.println(policyDetails);
        String policyDetail[] = policyDetails.split("\s");
        int pLength = policyDetail.length;
        for (int i = 0; i < pLength; i++) {
            if (policyDetail[i].equals(string)) {
                System.out.println("Policy Tag Is Presented");
            } else if (policyDetail[i].equals(string2)) {
                System.out.println("Total Policy Number Has Updated");
            } else if (policyDetail[i].equals(string3)) {
                System.out.println("Monthly Policy Number Has Updated");

            } else {
                Assert.fail();
            }
        }
    }

    @Then("User is able to see tag {string} and number of total claim {string} and monthly claim {string}")
    public void user_is_able_to_see_tag_and_number_of_total_claim_and_monthly_claim(String string, String string2, String string3) {
        String claimDetails = dbp.verifyClaims();
        System.out.println(claimDetails);
        String claimDetail[] = claimDetails.split("\s");
        int cLength = claimDetail.length;
        for (int i = 0; i < cLength; i++) {
            if (claimDetail[i].equals(string)) {
                System.out.println("Claim Tag Is Presented");
            } else if (claimDetail[i].equals(string2)) {
                System.out.println("Total Claim Number Has Updated");
            } else if (claimDetail[i].equals(string3)) {
                System.out.println("Monthly Claim Number Has Updated");

            } else {
                Assert.fail();
            }
        }

        try {
            ScreenRecorderUtil.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
