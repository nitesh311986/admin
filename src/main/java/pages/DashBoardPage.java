package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage  {
   /* public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }*/

    //Elements

    //Clients
    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div/div/a")
    WebElement clientTag;
    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div[2]/div/span")
    WebElement totalClient;
    @FindBy(xpath = "//div[@class='panel panel-primary']/div/div/div[3]/div/span")
    WebElement monthlyClient;

    //Quote
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div/div/a")
    WebElement quoteTag;
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div[2]/div/span")
    WebElement totalQuote;
    @FindBy(xpath = "//div[@class='panel panel-green']/div/div/div[3]/div/span")
    WebElement monthlyQuote;

    //Policy
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div/div/a")
    WebElement policyTag;
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div[2]/div/span")
    WebElement totalPolicy;
    @FindBy(xpath = "//div[@class='panel panel-yellow']/div/div/div[3]/div/span")
    WebElement monthlyPolicy;

    //Claims
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div/div/a")
    WebElement claimTag;
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div[2]/div/span")
    WebElement totalClaims;
    @FindBy(xpath = "//div[@class='panel panel-red']/div/div/div[3]/div/span")
    WebElement monthlyClaims;

    public String verifyClientDetails() {
        String client = clientTag.getText();
        String total = totalClient.getText();
        String monthly = monthlyClient.getText();
        return client + " " + total + " " + monthly;
    }

    public String verifyQuote() {
        String quote = quoteTag.getText();
        String totalQ = totalQuote.getText();
        String monthQ = monthlyQuote.getText();
        return quote + " " + totalQ + " " + monthQ;

    }

    public String verifyPolicy() {
        String policy = policyTag.getText();
        String totalP = totalPolicy.getText();
        String monthP = monthlyPolicy.getText();
        return policy + " " + totalP + " " + monthP;
    }

    public String verifyClaims() {
        String claims = claimTag.getText();
        String totalC = totalClaims.getText();
        String monthC = monthlyClaims.getText();
        return claims + " " + totalC + " " + monthC;
    }
}
