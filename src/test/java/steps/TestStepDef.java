package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static steps.Hooks.myDriver;

public class TestStepDef {

    //WebDriver myDriver;

    @Given("^Test Facebook page$")
    public void step() {
        System.out.println("Test Facebook page");

    }

    @When("^I access Facebook page$")
    public void step1() {
        myDriver.get("https://www.facebook.com/");
    }

    @Then("^It dispalys the Facebook home page elements$")
    public void step2() {
        Assert.assertEquals(true,myDriver.findElement(By.id("email")).isDisplayed());
    }
    public void step3() {
        Assert.assertEquals(true,myDriver.findElement(By.id("day")).isDisplayed());
    }


}
