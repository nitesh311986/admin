package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TaskPage;

public class TaskPageSteps {
    TaskPage taskPage = new TaskPage(DriverFactory.getDriver());

    @When("User clicks on task icon on left tool bar")
    public void user_clicks_on_task_icon_on_left_tool_bar() {
        taskPage.clickOnTaskIcon();

    }

    @Then("User redirects to {string} page")
    public void user_redirects_to_page(String string) {
        String Message = taskPage.verifyTaskPage();
        Assert.assertEquals(Message, string);
    }

    @Then("User see concern data on manage task page")
    public void user_see_concern_data_on_manage_task_page() {
        String pageData = taskPage.fetchData();
        System.out.println(pageData);

    }

    @When("user clicks on add task button")
    public void user_clicks_on_add_task_button() {
        taskPage.clickAddTaskButton();

    }

    @Then("User redirects to page with {string} message")
    public void user_redirects_to_page_with_message(String string) {
     String Message=taskPage.verifyAddTaskPage();
     Assert.assertEquals(Message,string);
    }

    @Then("Assigned to dropdown appears with initial {string} current user")
    public void assigned_to_dropdown_appears_with_initial_current_user(String string) {
     String userName=taskPage.verifyDropDown();
     Assert.assertEquals(userName,string);
    }
}
