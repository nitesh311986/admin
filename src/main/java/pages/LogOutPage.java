package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage  {
    /*public LogOutPage(){
        PageFactory.initElements(driver,this);
    }*/
    @FindBy(css = "ul[id='side-menu']>li:nth-child(12)")
    WebElement logOutIcon;
    @FindBy(xpath = "//div[@class='middle-box text-center loginscreen']/header/h4")
    WebElement logInMessage;

    //Methods
    public void clickOnLogOutButton(){
        logOutIcon.click();
    }
    public String verifyLogInPage()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return logInMessage.getText();
    }


}
