package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClientPage {
    private WebDriver driver;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(3)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");


    public String verifyClientManage() {
        driver.findElement(clientIcon).click();
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array +" " +rEle.getText();
        }
        return array;

    }


}
