package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //1.Create a class constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By displayedText= By.xpath("//p[@class='copyright']/small");

    public String verifyUrl(){
        return driver.getCurrentUrl();
    }

    public String verifyMessage(){
        return driver.findElement(displayedText).getText();
    }
}
