package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;

    //1.Create a class constructor
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    //Login Form Elements
    private By emailField = By.xpath("//input[@id='UserName']");
    private By passwordField = By.xpath("//input[@id='Password']");
    private By accountLoginButton = By.xpath("//button[@id='login']");
    private By dashBoardTitle = By.cssSelector("h2[class='main-title']");
    private By roleText = By.xpath("//span[@class='welcome-message']/label/small");


    //Action Methods

    public String verifyUrl() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.getCurrentUrl();

    }

    public void enterUserName(String userN) {
        driver.findElement(emailField).sendKeys(userN);

    }

    public void enterPassword(String Password) {
        driver.findElement(passwordField).sendKeys(Password);

    }

    public void clickSubmit() {
        driver.findElement(accountLoginButton).click();
    }

    public String verifyDashBoardTitle() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(dashBoardTitle).getText();
    }

    public String verifyRoleText() {
        return driver.findElement(roleText).getText();
    }


}
