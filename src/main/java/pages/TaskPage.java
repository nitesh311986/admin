package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TaskPage {
    private WebDriver driver;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
    }

    private By taskIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(7)");

    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By addTaskButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By assignDropDown = By.xpath("//div[@class='ibox float-e-margins']/div[1]/div/div[6]/div/div/div/span/span/span[2]");

    public void clickOnTaskIcon() {
        driver.findElement(taskIcon).click();
    }

    public String verifyTaskPage() {
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String data = " ";
        for (WebElement rEle : totalRow) {
            data = data + " " + rEle.getText();
        }
        return data;
    }

    public void clickAddTaskButton() {
        driver.findElement(addTaskButton).click();
    }

    public String verifyAddTaskPage() {
        return driver.findElement(displayedMessage).getText();

    }
    public String verifyDropDown(){
        driver.findElement(assignDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> drop = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='AssignedToId_listbox']/li[1]/table/tbody/tr/td")));
        System.out.println(drop.size());
        String rev="";
        for (WebElement element:drop)
        {
            rev=rev+element.getText()+" ";
            System.out.println(element.getText());
        }
        return rev;

    }
}
