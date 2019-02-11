package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static steps.Hooks.myDriver;

public class FacebookLoginPage1 {
    WebElement emailInput;
    //WebElement password;
    //  WebElement firstName ;
    //WebElement secondName ;
    WebElement dayDropDown ;

    public FacebookLoginPage1(WebDriver myDriver) {
        emailInput = myDriver.findElement(By.id("email"));
        dayDropDown= myDriver.findElement(By.id("day"));
       // password = myDriver.findElement(By.id("pass"));


    }

}
