package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By accountIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(8)");


    public void clickOnAccountIcon() {
        driver.findElement(accountIcon).click();
    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));

        //Store the ID of the original window

        for (WebElement cEle : totalColumn) {
            cEle.click();
            //System.out.println(cEle.getText());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            //driver.findElement(accountIcon).click();
            //driver.navigate().to("http://52.32.106.250:7779/Account/AccountDashboard");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


}