package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginPage {
    @FindBy(id = "email")
    static WebElement emailInput;
    static WebElement dayDropDown;

    public static void assertEmailInputDisplayed(String[] args) {
        Assert.assertEquals(true,emailInput.isDisplayed());
      //junit word assert and @run we will use this
    }

    public static void enterEmailInput(String[]emailId ) {
        emailInput.sendKeys(emailId);

    }
    public void selectDayFromDropDown(String[] dayString) {
        Select daySelect = new Select(dayDropDown);
        daySelect.selectByValue("11");
}
}
