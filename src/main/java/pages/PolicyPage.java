package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class PolicyPage {
    private WebDriver driver;

    public PolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    private By policyIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(5)");

    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnPolicyInformation = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By letterIcon=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[11]");

    private By downloadIcon= By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]");

    public void clickPolicyIcon() {
        driver.findElement(policyIcon).click();
    }

    public String verifyManagePolicyPage() {
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    public String verifyDateFormatOfStartDate() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> policyDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String dateArray = " ";
        for (WebElement startDate : policyDateColumn) {
            dateArray = dateArray + " " + startDate.getText().toString();

        }
        return dateArray;
    }

    public String verfiyDateFormatOfExpireDate() {
        WebDriverWait eWait = new WebDriverWait(driver, 10);
        List<WebElement> endDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String dateArray = " ";
        for (WebElement endDate : endDateColumn) {
            dateArray = dateArray + " " + endDate.getText().toString();
        }
        return dateArray;

    }

    public void clickOnPolicyNumberLink() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]")));
        for (WebElement cEle : totalColumn) {
            cEle.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            break;

        }

    }

    public String verifyPolicyInformationPage() {
        return driver.findElement(displayedMessageOnPolicyInformation).getText();

    }
    public void LetterIcon() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(letterIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void DownloadIcon() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(downloadIcon));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait dWait = new WebDriverWait(driver, 10);
        List<WebElement> totalDownLoadSymbol = dWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        int dSize = totalDownLoadSymbol.size();

        for (int i = 0; i < dSize; i++) {
            totalDownLoadSymbol.get(i).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }

        //driver.switchTo().window(tabs2.get(0));
    }
    public String verifyDownLoadFile()
    {
        File myfile = new File("C:/Users/prowe/Downloads/BPIS Document - Welcome Letter.pdf");
        //FileUtils.touch(myfile);
        String re="";

        if (myfile.exists()) {
            re="file exist";

        } else {

            System.out.println("The file does not exist");
        }
        return re;
    }


}
