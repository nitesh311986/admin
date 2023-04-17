package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ApproveClaimPage {
    private WebDriver driver;
    public ApproveClaimPage(WebDriver driver){
        this.driver=driver;
    }

    private By claimIcon=By.cssSelector("ul[id='side-menu']>li:nth-child(6)");

    private By approveClaimIcon=By.xpath("//ul[@id='side-menu']/li[6]/ul/li[2]");

    private By displayedMessage=By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    public void clickOnApproveClaimButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(claimIcon)).perform();
        driver.findElement(approveClaimIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyApproveClaimPage(){
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchData(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> data = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='divLoadApproveClaimsList']/div/table/tbody")));
        String array = " ";
        for (WebElement rEle : data) {
            array = array + " " + rEle.getText();
        }

        return array;

    }
}
