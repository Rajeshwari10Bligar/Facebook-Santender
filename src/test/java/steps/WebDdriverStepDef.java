package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static steps.Hooks.myDriver;

public class WebDdriverStepDef {


    @Given("^Test santender home page$")
    public void test_Santender_Home_Page() {

    }

    Wait wait= new WebDriverWait(myDriver,10);
    WebElement aboutOnlineBankingLink;

    @When("^when i access the santender home page$")
    public <thread> void when_I_Access_The_Santender_Home_Page() throws InterruptedException {
        ArrayList<String>  tabs2;
        myDriver.get("https://retail.santander.co.uk/LOGSUK_NS_ENS/BtoChannelDriver.ssobto?dse_operationName=LOGON&dse_processorState=initial&redirect=S");

        if(myDriver.findElement(By.xpath("//div[@id ='splash-97123-body']")).isDisplayed()){
            myDriver.findElement(By.xpath("//div[@title='Close']")).click();
        }
     // if the element not find then only we can see the 10 sec wait

        aboutOnlineBankingLink=(WebElement)wait
                .until (ExpectedConditions.presenceOfElementLocated(By.id("infoLDAP_E.customerID")));


        myDriver.findElement(By.xpath("//a[text()='About Online Banking']")).click();

        tabs2 = new ArrayList<String>(myDriver.getWindowHandles());

        myDriver.switchTo().window(tabs2.get(0));

        sleep(10000);

        myDriver.switchTo().window(tabs2.get(1));

        myDriver.switchTo().window(tabs2.get(0));

        myDriver.findElement(By.xpath("//a[text()='Contact us']")).click();

        tabs2.add(myDriver.getWindowHandle());

        myDriver.switchTo().window(tabs2.get(2));

        sleep(10000);


       for(String h: tabs2){
            myDriver.switchTo().window(h);

        }
    }

        @Then("^Displays the  santender home page web elements$")
        public void displays_The_Santender_Home_Page_Web_Elements() {
            System.out.println("iam in thhen statement");
        }
    }

